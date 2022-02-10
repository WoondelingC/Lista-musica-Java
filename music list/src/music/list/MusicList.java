package music.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Colina
 */
public class MusicList {

    static void listOption() {

        Album Ve[] = new Album[9];
        Ve[0] = new Album("Clasico de la provincia", "27 de agosto 1993", 52, "vallenato", "Caratula", "Nombre del sexto trabajo discografico de Carlos Vives");
        Ve[1] = new Album("La novena batalla", "13 de junio 2013", 60, "Vallenato", "Caratula", "Hace referencia al noveno album de Silvestre Dangond");
        Ve[2] = new Album("La fama", "9 de noviembre de 2002", 56, "Vallenato", "Caratula", "Segun por propias palabras de Silvestre Dangond es una propuesta internacional");
        Ve[3] = new Album("Carnaval de exitos", "1 de enero 2001", 43, "Salsa", "Caratula", "El memorable disco de estudio de Celia Cruz");
        Ve[4] = new Album("Todo a su tiempo", "4 de enero de 1995", 43, "Salsa", "Caratula", "Segundo album de Marc Anthony");
        Ve[5] = new Album("The best", "27 de junio 1994", 73, "Salsa", "Caratula", "Disco grabado por el grupo Niche");
        Ve[6] = new Album("Repitela", "26 de abril 2019", 50, "Ranchera", "Caratula", "Segundo album del cantante Jessi Uribe");
        Ve[7] = new Album("Abrazame muy fuerte", "31 de diciembre 1989", 54, "Ranchera", "Caratula", "Abrázame muy fuerte es el título del almbum numero 27 de Juan Gabriel");
        Ve[8] = new Album("Recuerdo 2", "1 de enero 1984", 42, "Ranchera", "Caratula", "Con este disco logró lo que ningún artista mexicano ha conseguido en la historia: mantenerse en el primer lugar de popularidad por espacio de 18 meses");


        for (Album Ve1 : Ve) {
            System.out.println(Ve1.getidMusic() + ": " + Ve1.Title);
            
        }

        Scanner console = new Scanner(System.in);
            System.out.println("Elige la musica a agregar en tu PlayList");
            int x = Integer.parseInt(console.nextLine());
            
            ArrayList list = new ArrayList();
            
            switch (x) {
            case 1 -> {
                list.add(Ve[0]);

            }
            case 2 -> {
                list.add(Ve[1]);

            }
            case 3 -> {
                list.add(Ve[2]);

            }
            case 4 -> {
                list.add(Ve[3]);
            }
            case 5 -> {
                list.add(Ve[4]);
            }

            default ->
                System.out.println("Se pueden agregar un maxio de 5 canciones a la lista");
        }

    }
    


    public static void main(String[] args) {
        
       listOption();
    
    }
}

/**
 * public void cambiar(int p1, int p2){ Libro temp; temp=vec[p1];
 * vec[p1]=vec[p2]; vec[p2]=temp; } int i, j; for(i=0;i<Ve.length;i++) {
 * for(j=i+1;j<Tam;j++) {
 * if(vec[i].getTitulo().compareTo(vec[j].getTitulo())<0);{ cambiar(i,j); } } }
 */
        /**
         * public void cambiar(int p1, int p2){ Libro temp; temp=vec[p1];
         * vec[p1]=vec[p2]; vec[p2]=temp; } int i, j; for(i=0;i<Ve.length;i++) {
         * for(j=i+1;j<Tam;j++) {
         * if(vec[i].getTitulo().compareTo(vec[j].getTitulo())<0);{
         * cambiar(i,j); } } }
         *
         */
