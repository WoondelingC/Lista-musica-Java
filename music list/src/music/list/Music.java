package music.list;

/**
* Clase abstracta contiene los atributos principales a heredar a su clase hija
* y los metodos get y set de cada atributo, ademas los metodos abstractos
*
*
* @version 01-01-01 2022-02-12 
* 
* @author Jose Colina josecolinamartinez@gmail.com
*
* @since 01
*/
public abstract class Music {
    /**
     * Declaración de atributos
     */
    public String title;
    public int date;
    public int duration;
    public String gender;
    public String portada;
    public String description;

    /**
     * Constructor de la clase abstracta
     * @param title
     * @param date
     * @param duration
     * @param gender
     * @param portada
     * @param description 
     */
    public Music(String title, int date, int duration, String gender, String portada, String description) {
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.gender = gender;
        this.portada = portada;
        this.description = description;
    }
    /**
     * Contructor con los parametros inicializados
     */
    public Music(){
        title = "";
        date = 0;
        duration = 0;
        gender = "";
        portada = "";
        description = "";
    }
    /**
    * Metodo creado con el fin de obtener el titulo de la musica
    * 
    * @return regresa el titulo
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public String getTitle() {
        return title;
    }
    
    /**
    * Metodo creado con el fin de modificar el titulo de la musica
    * 
    * @param title
    * @author Jose Colina josecolinamartinez@gmail.com
    * 
    * @since 01
    */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
    * Metodo creado con el fin de obtener la fecha de la musica
    * 
    * @return regresa la fecha
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public int getDate() {
        return date;
    }
    
    /**
    * Metodo creado con el fin de modificar la fecha de la musica
    * 
    * @param date
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public void setDate(int date) {
        this.date = date;
    }
    
    /**
    * Metodo creado con el fin de obtener la duración de la musica
    * 
    * @return regresa el la duración
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public float getDuration() {
        return duration;
    }
    
    /**
    * Metodo creado con el fin de modificar la duración de la musica
    * 
    * @param duration
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    /**
    * Metodo creado con el fin de obtener el genero de la musica
    * 
    * @return regresa el genero
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public String getGender() {
        return gender;
    }
    
    /**
    * Metodo creado con el fin de modificar el genero de la musica
    * 
    * @param gender
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    /**
    * Metodo creado con el fin de obtener la portada de la musica
    * 
    * @return regresa la portada
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public String getCover() {
        return portada;
    }
    
    /**
    * Metodo creado con el fin de modificar la portada de la musica
    * 
    * @param portada
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public void setCover(String portada) {
        this.portada = portada;
    }
    
    /**
    * Metodo creado con el fin de mostrar la informacion de las muscias
    * de manera mas clara
    * 
    * @return devuelve la descripcion de la musica
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public String getDescription() {
        return description;
    }
    
    /**
    * Metodo creado con el fin de modificar la descripcion de la musica
    * 
    * @param description
    * @author Jose Colina josecolinamartinez@gmail.com
    *
    * @since 01
    */
    public void setDescription(String description) {
        this.description = description;
    }
    
    public abstract String information();
    
}