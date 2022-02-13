package music.list;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Yorman Colina
 */
public class FilterMusic implements IMusic {
/**
 * Implementacion del metodo FiltrarGenerso en el cual le ponemos los parametros Lista y Genero
 * llamamos Album como vector luego se crea un for el cual me va recorrer el vector Album
 * una vez termine de recorrerlo va hacer una comparacion de lista en la posicion i con el parametro
 * Genero ignorandome los mayusculas y minisculas una vez la comparacion sea verdadera mostrara
 * mostrara todos los albunes del genero comparado 
 * @param Gender
 * @return 
 */
    @Override
    public List<Album> FilterGenre(ArrayList<Album> musicList, String Gender) {
        List<Album> ox = new ArrayList();
        
        for (int i=0; i < musicList.size(); i++) {
            if (musicList.get(i).Gender.contentEquals(Gender)) {
                ox.add((Album) musicList.get(i));
            }
        }
        
        return ox;
    }
    
    /**
 * Implementacion del metodo FiltrarAño en el cual le ponemos los parametros Lista y Fecha
 * llamamos Album como vector luego se crea un for el cual me va recorrer el vector Album
 * una vez termine de recorrerlo va hacer una comparacion de lista en la posicion i con el parametro
 * Fecha una vez la comparacion sea verdadera mostrara mostrara todos los albunes del año comparado 
 * @param date
 * @return 
 */

    @Override
    public List<Album> FilterYear(ArrayList<Album> musicList,int date) {
    
           List<Album> ot = new ArrayList();
        
        for(int i = 0; i < musicList.size(); i++){
        
            if (musicList.get(i).Date == date) {
               ot.add((Album) musicList.get(i));
            }
        }
        
        return ot; 
    }    

    /**
     * 
     * @param musicList 
     */
    @Override
    public void FilterYearDuration(ArrayList<Album> musicList){
        for(int i=0;i<musicList.size();i++){
            Album aux;
            for(int j=i+1; j < musicList.size(); j++){
                if(musicList.get(i).Date > musicList.get(j).Date){
                aux=musicList.get(j);
                musicList.set(j,musicList.get(i));
                musicList.set(i,aux);
                }
            }
        }
    }
}
        

