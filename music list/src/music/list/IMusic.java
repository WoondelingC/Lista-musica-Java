package music.list;

import java.util.ArrayList;
import java.util.List;


public interface IMusic {
    /**
    * Detalle el objetivo del método.Metodo creado con el fin de recorrer el ArrayList musicList, 
      obtener los datos del mismo y filtrarlos mediante su genero
      y agregar y mostrar una nueva lista con las canciones 
      dependiendo de la opcion ingresada por el usuario
    *
    * @param musicList lista principal de canciones
    * @param genders generos 
    * @return regresa la lista filtrada
    * @author Jose Colina josecolinamartinez@gmail.com
    * 
    * @since 01    
    */
    public List<Album> FilterGenre(ArrayList<Album> musicList, String genders);
    
    /**
    * Metodo creado con el fin de recorrer el ArrayList musicList, 
      obtener los datos del mismo y filtrarlos mediante su fecha
      y agregar y mostrar una nueva lista con las canciones 
      dependiendo de la opcion ingresada por el usuario
    *
    * @param musicList lista principal de canciones
    * @param date fecha 
    * @return regresa la lista filtrada
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01    
    */
    public List<Album> FilterYear(ArrayList<Album> musicList,int date);
    
    /**
    * Metodo creado con el fin de recorrer el ArrayList musicList, 
      obtener los datos del mismo de manera ordenada por fecha y duracion
    *
    * @param musicList lista principal de canciones
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01    
    */
    public void FilterYearDuration(ArrayList<Album> musicList);
    
}
