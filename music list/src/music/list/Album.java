package music.list;

/**
 *
 * @author jonat
 */
public class Album extends Music implements Comparable<Album> {
    
    static int musicCounter = 0;
    
    private static int idMusic;
    //private String[] list = new Arraylist();

    public Album(String Title, Integer date, int Duration, String Gender, String portada, String Description) {
        super(Title, date, Duration, Gender, portada, Description);
        
        idMusic = ++ Album.musicCounter;
    }

    public int getidMusic() {
        return idMusic;
    }    

    @Override
    public void createPlaylist() {
        
    }

    @Override
    public int compareTo(Album o) {
        
        return date;
        
    }
    
}
