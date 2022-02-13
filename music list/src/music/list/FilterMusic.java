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
 * @param lista
 * @param Gender
 * @return 
 */
    @Override
    public List<Album> FilterGenre(Album[] lista, String Gender) {
        List<Album> ot = new ArrayList();
        
        for(int i = 0; i < list.size(); i++){
        
            if (lista[i].Gender.equalsIgnoreCase(Gender)) {
                ot.add(lista[i]);
            }
        }
        
        return ot;
    }
    
    /**
 * Implementacion del metodo FiltrarAño en el cual le ponemos los parametros Lista y Fecha
 * llamamos Album como vector luego se crea un for el cual me va recorrer el vector Album
 * una vez termine de recorrerlo va hacer una comparacion de lista en la posicion i con el parametro
 * Fecha una vez la comparacion sea verdadera mostrara mostrara todos los albunes del año comparado 
 * @param lista
 * @param Date
 * @return 
 */

    @Override
    public List<Album> FilterYear(List<Album> list, int date) {
    
           List<Album> ot = new ArrayList();
        
        for(int i = 0; i < list.size(); i++){
            
            if (list.get(i).date == date) {
               
                ot.add(list.get(i));
            }
        }
        
        return ot; 
    }    

    @Override
    public List<Album> FilterYearDuration(Album[] lista) {
        List<Album> ot = new ArrayList();
        
        for(int i = 0; i<(lista.length-1);i--){
            for(int j = 0;j<(lista.length-1);i++){
                if(lista[j].Date > lista[j+1].Date){
                    Album aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                    System.out.println(aux);
//                    for(int k = 0; k<lista.length;k++){
//                        System.out.println(lista[k].Title);
//                    }
                }
            }
        }
        
//        for(int i = 0; i<lista.length; i++){
//            if((lista[i].Date == Date) && (lista[i].Duration == Duration)){
//                ot.add(lista[i]);
//            }
//        }
        return ot;
    }
}
