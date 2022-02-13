package music.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yorman Colina
 */
public class FilterMusic implements IMusic {

    @Override
    public List<Album> FilterGenre(List<Album> list, String genero) {
        List<Album> ot = new ArrayList();
        
        for(int i = 0; i < list.size(); i++){
        
            if (list.get(i).Gender.equalsIgnoreCase(genero)) {
                ot.add(list.get(i));
            }
        }
        
        return ot;
    }
    
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

}
