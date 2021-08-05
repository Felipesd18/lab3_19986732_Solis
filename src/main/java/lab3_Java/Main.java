/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Felipe Solís
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        class Facebook implements RedSocial {
        
            String nombre; //Aqui guardaremos el nombre de la red social
            ListaDeUsuarios listaDeUsuarios; //Agui guardaremos a los usuarios de la red social
            ListaDePublicaciones listaPublicaciones; //Aqui guardaremos las publicaciones de la red social

            public Facebook(){
            this.nombre = "Facebook"; //Inicializamos el nombre con Facebook;
            this.listaDeUsuarios = new ListaDeUsuarios();
            this.listaPublicaciones = new ListaDePublicaciones();

            }

            //Metodo que se encarga de autenticar a un usuario con el mismo nombre o contrasenia en la lista
            //Dependiendo de su salida, nos indicara lo siguiente:
            //@param nombre nombre de la cuenta del usuario
            //@param contrasenia contrasenia de la cuenta del usuario
            //@return 2: Quiere decir que se encontro a un usuario con el mismo nombre y contrasenia
            //@return 1: Quiere decir que se encontro a un usuario con el mismo nombre
            //@return 0: Quiere decir que no se encontro a un usuario con el mismo nombre
            @Override
            public int authentication(String nombre, String contrasenia){ 

                String nombreUsuario; //Variable que guardara el nombre del usuario temporalmente de la lista
                String contraseniaUsuario; //Variable que guardara la contrasenia del usuario temporalmente de la lista

                for(int i=0; i < listaDeUsuarios.tamanio() ; i++){ //Recorremos la lista con el for  
                    nombreUsuario = listaDeUsuarios.getUsuario(i).getNombre(); //Guardamos el nombre del usuario de la posicion i
                    contraseniaUsuario = listaDeUsuarios.getUsuario(i).getContrasenia(); //Guardamos la contrasenia del usuario en la posicion i

                    if((nombreUsuario.equals(nombre)) && (contraseniaUsuario.equals(contrasenia))){ //Preguntamos si el nombre o la contrasenia recien obtenidas con iguales a las que son proporsionadas
                        return 2;
                    } else if (nombreUsuario.equals(nombre)){ //Preguntamos si existe el nombre solamente 
                        return 1;
                    }
                }
                return 0;
            }

            //Metodo que se encarga de registrar un usuario en la red social
            //@param nombre de la cuenta del usuario
            //@param contrasenia de la cuenta del usuario
            @Override
            public void register(String nombre, String contrasenia){

                if ((authentication(nombre, contrasenia) == 2) || (authentication(nombre, contrasenia) == 1)){
                    System.out.println("Las credenciales que se ingreso ya existen en la base de datos, intente con otro nombre de usuario.\n");

                } else{
                    Fecha fechaActual = new Fecha(); //Creamos la fecha actual
                    String fechaUsuario = fechaActual.obtenerFechaActual(); //Guardamos la fecha actual como string
                    Usuario nuevoUsuario = new Usuario(); //Creamos un nuevo usuario
                    nuevoUsuario.setNombre(nombre); //Guardamos el nombre
                    nuevoUsuario.setContrasenia(contrasenia); //Guardamos la contrasenia
                    nuevoUsuario.setFechaCreacion(fechaUsuario); //Guardamos la fecha
                    listaDeUsuarios.addUsuario(nuevoUsuario); //Agregamos en la lista de usuarios
                    System.out.println("Se ha registrado correctamente\nBienvenido(a): " + nombre);
                }

            }

            //Metodo para ingresar a un usuario que ya ha sido registrado anteriormente en la red social
            //@param nombre nombre de la cuenta a la cual se quiere ingresar
            //@param contrasenia de la cuenta a la cual se quiere ingresar
            @Override
            public void login(String nombre, String contrasenia){

            }
            @Override
            public void logout(){

            }
            @Override
            public void post(String tipo, String contenido, ArrayList<String> listaNombres){

            }
            @Override
            public void share(int id, ArrayList<String> listaNombres){

            }
            @Override
            public void visualize(){

            }
        }
        
        Facebook facebook = new Facebook();
        int opcion = 0;
        int usuarioActivo = -1;
        Scanner scanner = new Scanner(System.in);
        
        do{
            if(usuarioActivo == -1){
                System.out.println("#####" + facebook.nombre + "#####\nEscoja una opcion\n"
                + "1.   Iniciar Sesion\n"
                + "2.   Registrar\n"
                + "3.   Visualizar Red Social\n"
                + "4.   Salir\n"
                + "\n"
                + "Ingrese aqui su opcion:"
                );

                opcion = scanner.nextInt();
                
                switch(opcion){
                    case 1:
                        break;
                    case 2:
                        
                        System.out.println("#####Registro#####\nIngrese un nombre de usuario para su cuenta:");
                        String nombreUsuario = scanner.nextLine();
                        System.out.println("#####Registro#####\nA continuacion ingrese una contrasenia para su cuenta:");
                        String contraseniaUsuario = scanner.nextLine();
                        
                        facebook.register(nombreUsuario, contraseniaUsuario);
                        
                        
                        break;
                    case 3:
                        break;
                    case 4:
                        System.out.println("Saliendo de la Red Social.");
                        opcion = 0;
                        break;
                    default:
                        System.out.println("Opcion no valida. Ingrese una opcion valida.");
                        break;
                }
                
            }
        }while(opcion != 0);
        
        
    }
    
}
