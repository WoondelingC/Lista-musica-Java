package music.list;

import java.util.List;

/**
 *
 * @author jonat
 */
public class Album extends Music {
    
    static int musicCounter = 0;
    
    private int idMusic;
    //private String[] list = new Arraylist();

    public Album(String Title, int Date, int Duration, String Gender, String portada, String Description) {
        super(Title, Date, Duration, Gender, portada, Description);
        
        this.idMusic = ++ Album.musicCounter;
    }

    
    public String getTitle(){
        return this.Title;
    }

    public int getidMusic() {
        return idMusic;
    }    
    
   

    @Override
    public void sortList() {
        System.out.println("como vas");
    }


    @Override
    public void createPlaylist() {
        
    }
    
}
