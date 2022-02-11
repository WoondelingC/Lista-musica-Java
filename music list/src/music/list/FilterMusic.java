package music.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yorman Colina
 */
public class FilterMusic implements IMusic {

    @Override
    public List<Album> FilterGenre(Album[] lista, String genero) {
        List<Album> ot = new ArrayList();
        
        for(int i = 0; i < lista.length; i++){
        
            if (lista[i].Gender.equalsIgnoreCase(genero)) {
                ot.add(lista[i]);
            }
        }
        
        return ot;
    }

    @Override
    public List<Album> FilterYear(Album[] lista,int Date) {
    
           List<Album> ot = new ArrayList();
        
        for(int i = 0; i < lista.length; i++){
        
            if (lista[i].Date == Date) {
                ot.add(lista[i]);
            }
        }
        
        return ot; 
    }    

    @Override
    public List<Album> FilterYearDuration(Album[] lista) {
        List<Album> ot = new ArrayList();
        
        for(int i = 0; i<(lista.length-1);i++){
            for(int j = 0;j<(lista.length-1);i++){
                if((lista[j].Date > lista[j+1].Date) &&(lista[j].Duration > lista[j+1].Duration)){
                    Album aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
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
