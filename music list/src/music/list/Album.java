package music.list;
/**
 *
 * @author jonat
 */
public class Album extends Music {
    /**
     * 
     */
    static int musicCounter = 0;

    private final int idMusic;
    //private String[] list = new Arraylist();

    public Album(String Title, int Date, int Duration, String Gender, String portada, String Description) {
        super(Title, Date, Duration, Gender, portada, Description);

        this.idMusic = ++Album.musicCounter;
    }
    
    /**
     * 
     * @return 
     */
    public int getidMusic() {
        return idMusic;
    }
}
