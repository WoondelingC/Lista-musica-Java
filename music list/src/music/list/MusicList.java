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

        System.out.println(createMusic.getTitle());
        System.out.println("""
                            Su PlayList fue creada con exito
                            """);

    }

    ;
    
    public static void main(String[] args) {
        
        Music musicas[] = new Arraylist[3];
        String frutas[] = {"Uva", "Melon", "Mango"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);    
            }
            //System.out.println("frutas = " + frutas[i]);
        }
    }

