/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music.list;

import java.util.List;

/**
 *
 * @author Yorman Colina
 */
public interface IMusic {
    
    public List<Album> FilterGenre(Album[] lista, String genero);
    
    public List<Album> FilterYear(Album[] lista);
    
}
