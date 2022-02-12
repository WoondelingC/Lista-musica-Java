package music.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Jose Colina
 */
public class MusicList {
    
    

    static void listOption(Album[] Ve) {
        
    int x = 0;
    ArrayList list = new ArrayList();

    while (x < 9) {

        if(x < 9){
            for(int i = 0; i < Ve.length; i++){
                System.out.println(i + " " + Ve[i].Title);
            }
        }


        Scanner console = new Scanner(System.in);

        System.out.println("Elige la musica a agregar en tu PlayList");          


        x = Integer.parseInt(console.nextLine());

        switch (x) {
        case 1 -> {
            list.add(Ve[0].Title);

        }
        case 2 -> {
            list.add(Ve[1].Title);

        }
        case 3 -> {
            list.add(Ve[2].Title);

        }
        case 4 -> {
            list.add(Ve[3].Title);
        }
        case 5 -> {
            list.add(Ve[4].Title);
        }
        case 6 -> {
            list.add(Ve[5].Title);
        }
        case 7 -> {
            list.add(Ve[6].Title);
        }
        case 8 -> {
            list.add(Ve[7].Title);
        }
        case 9 -> {
            list.add(Ve[8].Title);
        }

        default ->
            System.out.println("Programa Finalizado");
    }

    }  

    System.out.println(list);

}


    public static void main(String[] args) {
            
        Album Ve[] = new Album[9];
        Ve[0] = new Album("Clasico de la provincia", 1993, 52, "Vallenato", 
                "Caratula", "Nombre del sexto trabajo discografico de Carlos Vives");
        Ve[1] = new Album("La novena batalla", 2013, 60, "Vallenato", 
                "Caratula", "Hace referencia al noveno album de Silvestre Dangond");
        Ve[2] = new Album("La fama",2002, 56, "Vallenato", 
                "Caratula", "Segun por propias palabras de Silvestre Dangond es una propuesta internacional");
        Ve[3] = new Album("Carnaval de exitos",2001, 43, "Salsa", 
                "Caratula", "El memorable disco de estudio de Celia Cruz");
        Ve[4] = new Album("Todo a su tiempo",1995, 43, "Salsa", 
                "Caratula", "Segundo album de Marc Anthony");
        Ve[5] = new Album("The best",1994, 73, "Salsa", 
                "Caratula", "Disco grabado por el grupo Niche");
        Ve[6] = new Album("Repitela",2019, 50, "Ranchera", 
                "Caratula", "Segundo album del cantante Jessi Uribe");
        Ve[7] = new Album("Abrazame muy fuerte",1989, 54, "Ranchera", 
                "Caratula", "Abrázame muy fuerte es el título del almbum numero 27 de Juan Gabriel");
        Ve[8] = new Album("Recuerdo 2",1984, 42, "Ranchera", 
                "Caratula", "Con este disco logró lo que ningún artista mexicano"
                        + " ha conseguido en la historia: mantenerse en el primer lugar"
                        + " de popularidad por espacio de 18 meses");
        
          listOption(Ve);
          
          Scanner consol = new Scanner(System.in);
          System.out.println("""
                             Que Genero deseas ver 
                             Vallenato 
                             Salsa 
                             Ranchera""");
          
          String generos = consol.nextLine();
          
          FilterMusic filtro = new FilterMusic();
          List<Album> listaFiltrada = filtro.FilterGenre(Ve, generos);
          
          for(int i = 0; i < listaFiltrada.size(); i++){
            System.out.println(listaFiltrada.get(i).Title);
          }
          
          
          System.out.println("""
                             De cual año deseas ver los Albunes 
                             2019
                             2013
                             2002
                             2001
                             1995
                             1994
                             1993
                             1989
                             1984""");
          int date = consol.nextInt();
          FilterMusic Filtro = new FilterMusic();
          List<Album> Listfiltrada = Filtro.FilterYear(Ve, date);
          
          for(int i = 0; i<Listfiltrada.size();i++){
              System.out.println(Listfiltrada.get(i).Title);
          }
          
          FilterMusic a = new FilterMusic();
          List<Album> LIstaFIltrada = a.FilterYearDuration(Ve);
          for(int i =0; i<LIstaFIltrada.size();i++){
              System.out.println(LIstaFIltrada.get(i).Date);
          }
          
    }
}
