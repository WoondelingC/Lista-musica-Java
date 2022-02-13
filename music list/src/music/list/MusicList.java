package music.list;

/**
 * importaciones de librerias usadas en el programa
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jose Colina, Jonathan Brito
 */
public class MusicList {

    /**
     * metodo usado para recorrer la lista de musica principal y validar las
     * musicas que quiera agregar el usuarip
     *
     * @param listCompleted lista de musica principal
     */
    static void listOption(List<Album> listCompleted) {

        int x = 0;
        ArrayList list = new ArrayList();

        /**
         *
         */
        while (x < 9) {
            if (x < 9) {
                for (int i = 0; i < listCompleted.size(); i++) {
                    System.out.println(i+1 + " " + listCompleted.get(i).Title);
                }
            }

            Scanner console = new Scanner(System.in);
            System.out.println("Elige la musica a agregar en tu PlayList");

            x = Integer.parseInt(console.nextLine());

            switch (x) {
                case 1 -> {
                    list.add(listCompleted.get(0).Title);
                }
                case 2 -> {
                    list.add(listCompleted.get(1).Title);
                }
                case 3 -> {
                    list.add(listCompleted.get(2).Title);
                }
                case 4 -> {
                    list.add(listCompleted.get(3).Title);
                }
                case 5 -> {
                    list.add(listCompleted.get(4).Title);
                }
                case 6 -> {
                    list.add(listCompleted.get(5).Title);
                }
                case 7 -> {
                    list.add(listCompleted.get(6).Title);
                }
                case 8 -> {
                    list.add(listCompleted.get(7).Title);
                }
                case 9 -> {
                    list.add(listCompleted.get(8).Title);
                }

                default ->
                    System.out.println("Programa Finalizado");
            }

        }

        System.out.println(list);

    }

    public static void main(String[] args) {

        /**
         *
         */
        ArrayList<Album> musicList = new ArrayList();

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

        musicList.add(music1);
        musicList.add(music2);
        musicList.add(music3);
        musicList.add(music4);
        musicList.add(music5);
        musicList.add(music6);
        musicList.add(music7);
        musicList.add(music8);
        musicList.add(music9);
        
        /**
         * 
         */
        FilterMusic a = new FilterMusic();
        a.FilterYearDuration(musicList);
        
        /**
         * 
         */
        listOption(musicList);
        
        /**
         * 
         */
        Scanner consol = new Scanner(System.in);
        System.out.println("""
                             Que Genero deseas ver 
                             Vallenato 
                             Salsa 
                             Ranchera""");

        String generos = consol.nextLine();

        FilterMusic filtro = new FilterMusic();
        List<Album> listaFiltrada = filtro.FilterGenre(musicList, generos);

        for (int i = 0; i < listaFiltrada.size(); i++) {
            System.out.println(listaFiltrada.get(i).Title);
        }
        /**
         * 
         */
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
        /**
         * 
         */
        int date = consol.nextInt();
        FilterMusic Filtro = new FilterMusic();
        List<Album> Listfiltrada = Filtro.FilterYear(musicList, date);
        /**
         * 
         */
        for (int i = 0; i < Listfiltrada.size(); i++) {
            System.out.println(Listfiltrada.get(i).Title);
        }
    }
}
