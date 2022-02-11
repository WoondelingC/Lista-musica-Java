package music.list;

import java.util.List;

/**
 *
 * @author jonat
 */
public abstract class Music {
    
    public String Title;
    public int Date;
    public int Duration;
    public String Gender;
    public String portada;
    public String Description;

    public Music(String Title, int Date, int Duration, String Gender, String Cover, String Description) {
        this.Title = Title;
        this.Date = Date;
        this.Duration = Duration;
        this.Gender = Gender;
        this.portada = Cover;
        this.Description = Description;
    }
    
    public Music(){
        Title = "";
        Date = 0;
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

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
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
    
    public abstract void sortList();

    @Override
    public String toString() {
        return "Music{" + "Title=" + Title + ", Date=" + Date + ", Duration=" + 
                Duration + ", Gender=" + Gender + ", portada=" + portada + 
                ", Description=" + Description + '}';
    }
    
}