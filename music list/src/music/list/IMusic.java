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
    /**
     * Creamos el metodo Arreglo FiltrarGenero en el cual ponemos como parametros
     * Genero y el arreglo Album Lista para asi ser sobrescrito en las clases que necesiten el metodo
     * @param list
     * @param Gender
     * @return 
     */
    public List<Album> FilterGenre(Album[] list, String Gender);
    /**
     * Creamos el metodo Arreglo FiltrarAño en el cual ponemos como parametros
     * Fecha y y el arreglo Album Lista para asi ser sobrescrito en las clases que necesiten el metodo
     * @param list
     * @param Date
     * @return 
     */
    public List<Album> FilterYear(Album[] list,int Date);
    /**
     * Creamos el metodo Arreglo FiltrarAñoDuracion en el cual ponemos como parametros
     * el arreglo Album Lista para asi ser sobrescrito en las clases que necesiten el metodo
     * @param list
     * @return 
     */
    public List<Album> FilterYearDuration(Album[] list);
    
}
