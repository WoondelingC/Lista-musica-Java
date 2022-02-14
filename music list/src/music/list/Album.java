package music.list;

/**
* Esta clase hereda de la clase abstracta sus atributos y metodos
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
    * metodo usado para obtener el id que se generara por objeto
    * 
    * @return id 
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public int getidMusic() {
        return idMusic;
    }

    /**
    * Metodo creado con el fin de mostrar la informacion de las muscias
    * de manera mas clara
    * 
    * @return informacion estructurada de cada canción
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    @Override
    public String information() {
        return "Music{" + "Title=" + title + ", Date=" + date + ", Duration=" + 
                duration + ", Gender=" + gender + ", portada=" + portada + 
                ", Description=" + description + '}';
    }
}
