package music.list;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Colina
 */
public class MusicList {

    static Music createMusic;
    

    static void listOption(int opt) {
        
              
        Album Ve[]= new Album[9];
        Ve[0] = new Album("Clasico de la provincia","27 de agosto 1993",52,"vallenato","Caratula","Nombre del sexto trabajo discografico de Carlos Vives");
        Ve[1] = new Album("La novena batalla","13 de junio 2013",60,"Vallenato","Caratula","Hace referencia al noveno album de Silvestre Dangond");
        Ve[2] = new Album("La fama","9 de noviembre de 2002",56,"Vallenato","Caratula","Segun por propias palabras de Silvestre Dangond es una propuesta internacional");
        Ve[3] = new Album("Carnaval de exitos","1 de enero 2001",43,"Salsa","Caratula","El memorable disco de estudio de Celia Cruz");
        Ve[4] = new Album("Todo a su tiempo","4 de enero de 1995",43,"Salsa","Caratula","Segundo album de Marc Anthony");
        Ve[5] = new Album("The best","27 de junio 1994",73,"Salsa","Caratula","Disco grabado por el grupo Niche");
        Ve[6] = new Album("Repitela","26 de abril 2019",50,"Ranchera","Caratula","Segundo album del cantante Jessi Uribe");
        Ve[7] = new Album("Abrazame muy fuerte","31 de diciembre 1989",54,"Ranchera","Caratula","Abrázame muy fuerte es el título del almbum numero 27 de Juan Gabriel");
        Ve[8] = new Album("Recuerdo 2","1 de enero 1984",42,"Ranchera","Caratula","Con este disco logró lo que ningún artista mexicano ha conseguido en la historia: mantenerse en el primer lugar de popularidad por espacio de 18 meses");

        for(int i=0;i<Ve.length;i++){
            System.out.println(Ve[i]);
        }
        
       /**
        *  public void cambiar(int p1, int p2){
        Libro temp;
        temp=vec[p1];
        vec[p1]=vec[p2];
        vec[p2]=temp;
    }
        int i, j;
        for(i=0;i<Ve.length;i++) {
            for(j=i+1;j<Tam;j++) {
                if(vec[i].getTitulo().compareTo(vec[j].getTitulo())<0);{
                cambiar(i,j);
                }
            }
        }
   
        */  
        
        
       
       
        
        
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