package music.list;

/**
 *
 * @author jonat
 */
public abstract class Music {
    /**
     * 
     */
    public String Title;
    public int Date;
    public int Duration;
    public String Gender;
    public String portada;
    public String Description;

    /**
     * 
     * @param Title
     * @param Date
     * @param Duration
     * @param Gender
     * @param Cover
     * @param Description 
     */
    public Music(String Title, int Date, int Duration, String Gender, String Cover, String Description) {
        this.Title = Title;
        this.Date = Date;
        this.Duration = Duration;
        this.Gender = Gender;
        this.portada = Cover;
        this.Description = Description;
    }
    /**
     * 
     */
    public Music(){
        Title = "";
        Date = 0;
        Duration = 0;
        Gender = "";
        portada = "";
        Description = "";
    }
    /**
     * 
     * @return 
     */
    public String getTitle() {
        return Title;
    }
    /**
     * 
     * @param Title 
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }
    /**
     * 
     * @return 
     */
    public int getDate() {
        return Date;
    }
    /**
     * 
     * @param Date 
     */
    public void setDate(int Date) {
        this.Date = Date;
    }
    /**
     * 
     * @return 
     */
    public float getDuration() {
        return Duration;
    }
    /**
     * 
     * @param Duration 
     */
    public void setDuration(int Duration) {
        this.Duration = Duration;
    }
    /**
     * 
     * @return 
     */
    public String getGender() {
        return Gender;
    }
    /**
     * 
     * @param Gender 
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    /**
     * 
     * @return 
     */
    public String getCover() {
        return portada;
    }
    /**
     * 
     * @param Cover 
     */
    public void setCover(String Cover) {
        this.portada = Cover;
    }
    /**
     * 
     * @return 
     */
    public String getDescription() {
        return Description;
    }
    /**
     * 
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Music{" + "Title=" + Title + ", Date=" + Date + ", Duration=" + 
                Duration + ", Gender=" + Gender + ", portada=" + portada + 
                ", Description=" + Description + '}';
    }
    
}