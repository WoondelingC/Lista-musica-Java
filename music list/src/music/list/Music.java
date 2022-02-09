/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.list;

/**
 *
 * @author jonat
 */
public abstract class Music {
    
    public String Title;
    public String Date;
    public float Duration;
    public String Gender;
    public String portada;
    public String Description;

    public Music(String Title, String Date, float Duration, String Gender, String Cover, String Description) {
        this.Title = Title;
        this.Date = Date;
        this.Duration = Duration;
        this.Gender = Gender;
        this.portada = Cover;
        this.Description = Description;
    }
    
    public Music(){
        Title = "";
        Date = "";
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public float getDuration() {
        return Duration;
    }

    public void setDuration(float Duration) {
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
    
    public abstract void FilterGenre();
    
    public abstract void FilterYear();
    
    
    
}