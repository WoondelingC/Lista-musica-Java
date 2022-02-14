package music.list;

/**
* [Detalle el objetivo de la clase.
*
* incorpore indicaciones de uso de la clase para facilitar su compresión.
* Esta clase hereda de la clase abstracta sus atributos y metods
* nos permite poder instanciar desde nuestra clase main un nuevo objeto
*
* @version 01-01-01 2022-02-12 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/

public class Album extends Music {
    /**
     * contador creado para generar un Id por cada objeto que se cree de la clase
     */
    static int musicCounter = 0;

    private final int idMusic;

    public Album(String title, int date, int duration, String gender, 
                 String portada, String description) 
    {
        super(title, date, duration, gender, portada, description);

        this.idMusic = ++Album.musicCounter;
    }
    
/**
* [Detalle el objetivo del método.
*
* metodo usado para obtener el id que se generara por objeto
* ]
* @return id
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*
*/
    public int getidMusic() {
        return idMusic;
    }
}
