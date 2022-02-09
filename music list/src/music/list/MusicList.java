package music.list;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Colina
 */
public class MusicList {

    static Music createMusic;
    

    static void listOption(int opt) {
        if(opt == 1) {
            createMusic = new Arraylist("", "", 0, "", "", "");
        }

        createMusic.Title = JOptionPane.showInputDialog("Ingrese el nombre de la canción");
        createMusic.Date = JOptionPane.showInputDialog("Ingres la fecha de lanzamiento");
        createMusic.Duration = Integer.parseInt(JOptionPane.showInputDialog("ingrese la duración"));
        createMusic.Gender = JOptionPane.showInputDialog("ingrese el genero de musica");
        createMusic.portada = JOptionPane.showInputDialog("ingrese la portada");
        
        
        System.out.println(createMusic.getTitle());
        System.out.println("""
                            Su PlayList fue creada con exito
                            """);

    }

    ;
    
    public static void main(String[] args) {
        
        int option = 1;

        while (option == 1) {

            String music = JOptionPane.showInputDialog("""
                                                      Crear una nave: 
                                                       1- crear una playList
                                                       2- Salir""");
            option = Integer.parseInt(music);

            if (option == 1) {
                listOption(option);
            }

        }
    }
}
