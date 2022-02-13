package music.list;


/**
 *
 * @author jonat
 */
public abstract class Music {
    
    public String Title;
    public int date;
    public int Duration;
    public String Gender;
    public String portada;
    public String Description;

    public Music(String Title, Integer date, int Duration, String Gender, String Cover, String Description) {
        this.Title = Title;
        this.date = date;
        this.Duration = Duration;
        this.Gender = Gender;
        this.portada = Cover;
        this.Description = Description;
    }
    
    public Music(){
        Title = "";
        date = 0;
        Duration = 0;
        Gender = "";
        portada = "";
        Description = "";
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Integer getDate() {
        return this.date;
    }

    public void setDate(int Date) {
        this.date = date;
    }

    public float getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCover() {
        return portada;
    }

    public void setCover(String Cover) {
        this.portada = Cover;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public abstract void createPlaylist();
    

    @Override
    public String toString() {
        return "Music{" + "Title=" + Title + ", Date=" + date + ", Duration=" + 
                Duration + ", Gender=" + Gender + ", portada=" + portada + 
                ", Description=" + Description + '}';
    }
    
}