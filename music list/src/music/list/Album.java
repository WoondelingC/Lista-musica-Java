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
public class Album extends Music implements IMusic {
    static int musicCounter = 0;
    
    private int idMusic;
    //private String[] list = new Arraylist();

    public Album(String Title, String Date, float Duration, String Gender, String portada, String Description) {
        super(Title, Date, Duration, Gender, portada, Description);
        
        this.idMusic = ++ Album.musicCounter;
    }


    public int getidMusic() {
        return idMusic;
    }    
    
    
    @Override
    public void createPlaylist() {
        
    }

    @Override
    public void sortList() {
        System.out.println("como vas");
    }

    @Override
    public void FilterGenre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void FilterYear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
