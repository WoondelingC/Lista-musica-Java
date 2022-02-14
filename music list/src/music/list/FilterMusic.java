package music.list;

import java.util.ArrayList;
import java.util.List;

/**
* clase creada con el fin de implementar y darle el comportamiento a los metodos
* creados para filtrar las canciones metidante el genero, fecha y organizar
* mediante la fecha y duración
*
* @version 01-01-01 2022-02-12 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/

public class FilterMusic implements IMusic {
    
    /**
    * Metodo creado con el fin de filtrar las músicas con respecto a su genero
    * aca se recorre la lista principal y si filtran los generos
    * 
    * @return musiGender lista filtrada por genero
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    @Override
    public List<Album> FilterGenre(ArrayList<Album> musicList, String genders) {
        List<Album> musicGender = new ArrayList();
        
        for (int i=0; i < musicList.size(); i++) {
            if (musicList.get(i).gender.contentEquals(genders)) {
                musicGender.add((Album) musicList.get(i));
            }
        }
        
        return musicGender;
    }
    
    
    /**
    * Metodo creado con el fin de filtrar las músicas con respecto a su fecha
    * aca se recorre la lista principal y si filtran los generos
    * 
    * @return musiYear lista filtrada por año
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    @Override
    public List<Album> FilterYear(ArrayList<Album> musicList,int date) {
    
           List<Album> musicYear = new ArrayList();
        
        for(int i = 0; i < musicList.size(); i++){
        
            if (musicList.get(i).date == date) {
               musicYear.add((Album) musicList.get(i));
            }
        }
        
        return musicYear; 
    }    

    /**
    * Metodo creado con el fin de ordenar la lista principal de músicas por año
    * y duración aca aplicamos el metodo burbuja para comparar las fechas
    * por posicion y posteriormente ir ordenando de menor a mayor
    * 
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    * 
    * @see consultar mas información con respecto al método de burbuja
    * Para consultar sobre el uso de este metodo, visite la siguiente dirección
    * <a
      href="https://buenasintencions.blogspot.com/2011/11/metodo-de-la-burbuja-
    * en-java.html#:~:text=La%20Ordenaci%C3%B3n%20de%20burbuja%20
    * (Bubble,est%C3%A1n%20en%20el%20orden%20equivocado."></a>
    */
    @Override
    public void FilterYearDuration(ArrayList<Album> musicList){
        for(int i=0;i<musicList.size();i++){
            Album aux;
            for(int j=i+1; j < musicList.size(); j++){
                if(musicList.get(i).date > musicList.get(j).date){
                aux=musicList.get(j);
                musicList.set(j,musicList.get(i));
                musicList.set(i,aux);
                }
            }
        }
    }
}
        

