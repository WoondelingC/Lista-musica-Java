package music.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Jose Colina
 */
public class MusicList {

    static void listOption(List<Album> listMusic) {

        int x = 0;
        ArrayList playList = new ArrayList();

        while (x < 9) {

            if (x < 9) {
                for (int i = 0; i < listMusic.size(); i++) {
                    System.out.println(i+1 + " " + listMusic.get(i).Title);
                }
            }

            Scanner console = new Scanner(System.in);

            System.out.println("Elige la musica a agregar en tu PlayList");

            x = Integer.parseInt(console.nextLine());

            switch (x) {
                case 1 -> {
                    playList.add(listMusic.get(1).Title);
                }
                case 2 -> {
                    playList.add(listMusic.get(2).Title);
                }
                case 3 -> {
                    playList.add(listMusic.get(3).Title);
                }
                case 4 -> {
                    playList.add(listMusic.get(4).Title);
                }
                case 5 -> {
                    playList.add(listMusic.get(5).Title);
                }
                case 6 -> {
                    playList.add(listMusic.get(6).Title);
                }
                case 7 -> {
                    playList.add(listMusic.get(7).Title);
                }
                case 8 -> {
                    playList.add(listMusic.get(8).Title);
                }
                case 9 -> {
                    playList.add(listMusic.get(9).Title);
                }

                default ->
                    System.out.println("Programa Finalizado");
            }

        }

        System.out.println(playList);

    }

    public static void main(String[] args) {

        Album music1 = new Album("Clasico de la provincia", 1993, 52, "Vallenato",
                "Caratula", "Nombre del sexto trabajo discografico de Carlos Vives");
        Album music2 = new Album("La novena batalla", 2013, 60, "Vallenato",
                "Caratula", "Hace referencia al noveno album de Silvestre Dangond");
        Album music3 = new Album("La fama", 2002, 56, "Vallenato",
                "Caratula", "Segun por propias palabras de Silvestre Dangond es una propuesta internacional");
        Album music4 = new Album("Carnaval de exitos", 2001, 43, "Salsa",
                "Caratula", "El memorable disco de estudio de Celia Cruz");
        Album music5 = new Album("Todo a su tiempo", 1995, 43, "Salsa",
                "Caratula", "Segundo album de Marc Anthony");
        Album music6 = new Album("The best", 1994, 73, "Salsa",
                "Caratula", "Disco grabado por el grupo Niche");
        Album music7 = new Album("Repitela", 2019, 50, "Ranchera",
                "Caratula", "Segundo album del cantante Jessi Uribe");
        Album music8 = new Album("Abrazame muy fuerte", 1989, 54, "Ranchera",
                "Caratula", "Abrázame muy fuerte es el título del almbum numero 27 de Juan Gabriel");
        Album music9 = new Album("Recuerdo 2", 1984, 42, "Ranchera",
                "Caratula", "Con este disco logró lo que ningún artista mexicano"
                + " ha conseguido en la historia: mantenerse en el primer lugar"
                + " de popularidad por espacio de 18 meses");
        
        List<Album> listMusic = new ArrayList();

        listMusic.add(music1);
        listMusic.add(music2);
        listMusic.add(music3);
        listMusic.add(music4);
        listMusic.add(music5);
        listMusic.add(music6);
        listMusic.add(music7);
        listMusic.add(music8);
        listMusic.add(music9);

        Collections.sort(listMusic);

        listOption(listMusic);

        Scanner consol = new Scanner(System.in);
        System.out.println("""
                             Que Genero deseas ver 
                             Vallenato 
                             Salsa 
                             Ranchera""");

        String generos = consol.nextLine();

        FilterMusic filtro = new FilterMusic();
        List<Album> listaFiltrada = filtro.FilterGenre(listMusic, generos);

        for (int i = 0; i < listaFiltrada.size(); i++) {
            System.out.println(listaFiltrada.get(i).Title);
        }

        System.out.println("""
                             De cual año deseas ver los Albunes 
                             1984
                             1989
                             1993
                             1994
                             1995
                             2001
                             2002
                             2013
                             2019""");        
        
        int date = consol.nextInt();
        System.out.println("date = " + date);
        FilterMusic Filtro = new FilterMusic();
        List<Album> Listfiltrada = Filtro.FilterYear(listMusic, date);

        for (int i = 0; i < Listfiltrada.size(); i++) {
            System.out.println(Listfiltrada.get(i).Title);
        }
       
    }
}
