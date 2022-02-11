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
    public List<Album> FilterYear(Album[] lista) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
