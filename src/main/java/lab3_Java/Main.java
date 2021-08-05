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
            ListaDePublicaciones listaDePublicaciones; //Aqui guardaremos las publicaciones de la red social

            public Facebook(){
            this.nombre = "Facebook"; //Inicializamos el nombre con Facebook;
            this.listaDeUsuarios = new ListaDeUsuarios();
            this.listaDePublicaciones = new ListaDePublicaciones();

            }
            
            /**
             * Metodo que se encarga de autenticar a un usuario con el mismo nombre o contrasenia en la lista
             * Dependiendo de su salida, nos indicara lo siguiente:
             * @param nombre nombre de la cuenta del usuario
             * @param contrasenia contrasenia de la cuenta del usuario
             * @return 2 Quiere decir que se encontro a un usuario con el mismo nombre y contrasenia
             * @return 1 Quiere decir que se encontro a un usuario con el mismo nombre
             * @return 0 Quiere decir que no se encontro a un usuario con el mismo nombre
             */
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
            
            /**
             * Metodo para ingresar a un usuario que ya ha sido registrado anteriormente en la red social
             * @param nombre nombre de la cuenta a la cual se quiere ingresar
             * @param contrasenia de la cuenta a la cual se quiere ingresar
             */
            @Override
            public void login(String nombre, String contrasenia){
                if(authentication(nombre, contrasenia) == 2){ //Preguntamos si el nombre y la contrasenia corresponde a un usuario registrado
                    int posicion = listaDeUsuarios.getUsuarioPorNombre(nombre); //Buscamos la posicion del usuario con el nombre en la lista de usuarios
                    listaDeUsuarios.getUsuario(posicion).setSesion(true); //Seteamos la sesion a true
                }else{
                    System.out.println("Las credenciales ingresadas no existen en la red social.");
                }
                System.out.println("Ingreso existoso.");
            }
            
            /**
             * Metodo para deslogear a un usuario activo dentro de una red social
             */
            @Override
            public void logout(){
                int posicion = listaDeUsuarios.getUsuarioActivo(); //Buscamos la posicion del usuario activo 
                listaDeUsuarios.getUsuario(posicion).setSesion(false); //Seteamos la sesion a false
            }
            
            /**
             * Metodo que se encarga de a un usuario activo pueda seguir a otro usuario registrado en la red social
             * @param nombre del usuario a seguir
             */
            public void follow(String nombre){
                int posicionActivo = listaDeUsuarios.getUsuarioActivo(); //Obtenemos la posicion del usuario activo en la lista de usuarios
                if(listaDeUsuarios.getUsuario(posicionActivo).nombre.equals(nombre)){ //Preguntamos si el nombre proporcionado es el mismo del usuario activvo
                    System.out.println("No puedes seguirte a ti mismo");
                }else{
                    int posicion = listaDeUsuarios.getUsuarioPorNombre(nombre); //Obtenemos la posicion del usuario a seguir
                    if(posicion == -1){
                        System.out.println("El nombre que se ingreso no coincide con algun usuario en la red social");
                    }else{
                         ArrayList<String> listaNombres = listaDeUsuarios.getUsuario(posicionActivo).getListaSeguidos(); //Obtenemos la lista de seguidos del usuario activo
                         listaNombres.add(nombre); //Agregamos el nombre del usuario a seguir
                         listaDeUsuarios.getUsuario(posicionActivo).setListaSeguidos(listaNombres); //Actualizamos la lista de seguidos del usuario activo
                         listaNombres = listaDeUsuarios.getUsuario(posicion).getListaSeguidores(); //Obtenemos la lista de seguidores del usuario a seguir
                         listaNombres.add(listaDeUsuarios.getUsuario(posicionActivo).nombre); //Agregamos el nombre del usuario activo
                         listaDeUsuarios.getUsuario(posicion).setListaSeguidores(listaNombres); //Actualizamos la lista de seguidores del usuario a seguir
                    }
                }
            }
            
            /**
             * Metodo para postear publicaciones dentro de una red social
             * @param tipo string que indica el tipo de publicacion que se realizara
             * @param contenido string que guarda el contenido de una publicacion
             * @param listaNombres lista de string que guarda los nombres a quienes se le quiere publicar el post
             */
            @Override
            public void post(String tipo, String contenido, ArrayList<String> listaNombres){
                Fecha fechaActual = new Fecha(); //Creamos la fecha actual
                String fechaPost = fechaActual.obtenerFechaActual(); //Guardamos la fecha actual como string
                Publicacion publicacion = new Publicacion(); //Creamos un nuevo dato de publicacion
                int posicionUsuarioActivo = listaDeUsuarios.getUsuarioActivo(); //Obtenemos el usuario activo de la red social
                publicacion.setNombreAutor(listaDeUsuarios.getUsuario(posicionUsuarioActivo).nombre); //Seteamos el nombre del autor con el nombre del usuario activo
                publicacion.setContenido(contenido); //Setemaos el contenido con el contenido entregado
                publicacion.setFechaRealizado(fechaPost); //Seteamos la fecha con la fecha actual
                listaDePublicaciones.addPublicaccion(publicacion); //Agregamos la publicacion en la lista de publicaciones
                publicacion = listaDePublicaciones.getPublicacion(listaDePublicaciones.tamanio() - 1); //Obtenemos la publicacion de nuevo, esto para actualizar el ID correspondiente
                ListaDePublicaciones listaPublicacionesAux = listaDeUsuarios.getUsuario(posicionUsuarioActivo).getListaPublicaciones(); //Obtenemos la lista de publicaciones del usuario
                listaPublicacionesAux.addPublicaccion(publicacion); //Agregamos la publicacion a la lista del usuario activo
                listaDeUsuarios.getUsuario(posicionUsuarioActivo).setListaPublicaciones(listaPublicacionesAux); //Actualizamos la lista de publicaciones del usuario activo
                
                if(listaNombres.size() != 0){//Preguntamos si la lista no esta vacia
                    if(listaDeUsuarios.getUsuario(posicionUsuarioActivo).sigueAUsuarios(listaNombres)){ //Preguntamos si los nombres proporcionados los sigue el usuario activo
                        for(int i = 0; i < listaNombres.size() ; i ++){
                            listaPublicacionesAux = listaDeUsuarios.getUsuario(i).getListaPublicaciones(); //Obtenemos la lista de publicaciones del usuario actual
                            listaPublicacionesAux.addPublicaccion(publicacion); //Agregamos la publicacion 
                            listaDeUsuarios.getUsuario(i).setListaPublicaciones(listaPublicacionesAux); //Actualizamos la lista de publicaciones del usuario actual
                        }
                    }else{
                        System.out.println("Uno de los nombres de usuarios que se introdujo no lo seguias, se logro publicar en tu perfil.");
                    }
                }
                System.out.println("Se logro realizar la publicacion");
            }
            
            /**
             * Metodo que se encarga de compartir una publicacion que esta en la red social
             * @param id de la publicacion que se quiere compartir
             * @param listaNombres de usuarios a quienes se quiere compartir la publicacion
             */
            @Override
            public void share(int id, ArrayList<String> listaNombres){
                int posicion = listaDePublicaciones.getPublicacionPorID(id); //Obtenemos la posible posicion de la publicacion dentro de la lista de publicaciones
                
                if(posicion == -1){ //Preguntamos si no se encontro la publicacion
                    System.out.println("No se encontro la publicacion solicitada.");
                }else{
                    Publicacion publicacion = listaDePublicaciones.getPublicacion(posicion); //Guardamos la publicacion
                    posicion = listaDeUsuarios.getUsuarioActivo(); //Obtenemos la posicion del usuario activo en la red social
                    ListaDePublicaciones listaAux = listaDeUsuarios.getUsuario(posicion).listaPublicaciones; //Obtenemos la lista de publicaciones del usuario activo
                    listaAux.addPublicaccion(publicacion); //Agregamos la publicacion a la lista de publicaciones del usuario activo
                    listaDeUsuarios.getUsuario(posicion).setListaPublicaciones(listaAux); //Seteamos la lista de publicaciones del usuario activo
                    
                    if(listaDeUsuarios.getUsuario(posicion).sigueAUsuarios(listaNombres)){ //Preguntamos si el usuario sigue a los usuarios dados
                        for(int i = 0; i < listaNombres.size() ; i ++){
                            listaAux = listaDeUsuarios.getUsuario(i).getListaPublicaciones(); //Obtenemos la lista de publicaciones del usuario actual
                            listaAux.addPublicaccion(publicacion); //Agregamos la publicacion 
                            listaDeUsuarios.getUsuario(i).setListaPublicaciones(listaAux); //Actualizamos la lista de publicaciones del usuario actual
                        }
                        System.out.println("Se lorgro compartir la publicacion.");
                    }else{
                        System.out.println("Uno de los nombres de usuarios que se introdujo no lo seguias, se logro compartir en tu perfil.");
                    }
                }
                
            }
            /**
             * Metodo que se encarga de pasar a string la red social
             * @return redSocialString esta tendra dos salida y dependera si existe un usuario activo
             */
            @Override
            public String visualize(){
                String redSocialString = "";
                int posicion = listaDeUsuarios.getUsuarioActivo(); //Obtenemos la posicion del usuario activo
                if(posicion == -1){ //Preguntamos si no se encontro una posicion con el usuario activo
                    redSocialString = 
                            "#####" + nombre + "#####\n" +
                            "Lista de Usuarios:\n" + listaDeUsuarios.pasarAStringListaUsuarios()+
                            "Lista de Publicaciones:\n" + listaDePublicaciones.pasarAStringListaPublicaciones(); //Generamos el string de la red social completa
                }else{
                    redSocialString = listaDeUsuarios.getUsuario(posicion).pasarAStringUsuario(); //Generamos string con la informacion del usuario
                }
                
                return redSocialString;
            }
        }
        
        Facebook facebook = new Facebook();
        int opcion = 0;
        Scanner leerEntero = new Scanner(System.in);
        Scanner leerCarac = new Scanner(System.in);
        String nombreUsuario = "";
        String contraseniaUsuario = ""; 
        
        do{
            if(facebook.listaDeUsuarios.getUsuarioActivo() == -1){
                System.out.println("#####" + facebook.nombre + "#####\nEscoja una opcion\n"
                + "1.   Iniciar Sesion.\n"
                + "2.   Registrar.\n"
                + "3.   Visualizar Red Social.\n"
                + "4.   Salir.\n"
                + "\n"
                + "Ingrese aqui su opcion:"
                );
                opcion = leerEntero.nextInt();
                
                switch(opcion){
                    case 1://Iniciar sesion
                        
                        System.out.println("#####Inicio Sesion#####\nIngrese el nombre de usuario de su cuenta:");
                        nombreUsuario = leerCarac.nextLine();
                        System.out.println("A continuacion ingrese la contrasenia de su cuenta:");
                        contraseniaUsuario = leerCarac.nextLine();
                        
                        facebook.login(nombreUsuario, contraseniaUsuario);
                        
                        break;
                    case 2: //Registrar
                        
                        System.out.println("#####Registro#####\nIngrese un nombre de usuario para su cuenta:");
                        nombreUsuario = leerCarac.nextLine();
                        System.out.println("A continuacion ingrese una contrasenia para su cuenta:");
                        contraseniaUsuario = leerCarac.nextLine();
                        
                        facebook.register(nombreUsuario, contraseniaUsuario);                        
                        break;
                    case 3://Visualizar
                        String stringRedSocial = facebook.visualize();
                        System.out.println(stringRedSocial);
                        break;
                    case 4://Salir
                        System.out.println("Saliendo de la Red Social.");
                        opcion = 0;
                        break;
                    default:
                        System.out.println("Opcion no valida. Ingrese una opcion valida.");
                        break;
                }
                
            } else{
                System.out.println("#####" + facebook.nombre + "#####\nEscoja una opcion\n"
                + "1.   Publicar.\n"
                + "2.   Seguir.\n"
                + "3.   Compartir\n"
                + "4.   Visualizar Red Social.\n"
                + "5.   Salir de la cuenta.\n"
                + "\n"
                + "Ingrese aqui su opcion:"
                );
                
                opcion = leerEntero.nextInt();
                System.out.println("");
                
                switch(opcion){
                    
                    case 1: //Publicar
                        
                        System.out.println("#####Publicar#####\nIngrese el tipo de publicacion:");
                        String tipo = leerCarac.nextLine();
                        
                        System.out.println("Ingrese el contenido de la publicacion");
                        String contenido = leerCarac.nextLine();
                        
                        
                        ArrayList<String> listaNombres = new ArrayList();
                        System.out.println("Desea publicar en perfil de amigos?\n1. Si\n2. No\n");
                        System.out.println("Opcion:\n");
                        int respuesta = leerEntero.nextInt();
                        
                        if(respuesta == 1){
                            System.out.println("Ingrese los nombres del usuario separados solo por ',':");
                            String nombres = leerCarac.nextLine();
                            String[] aux = nombres.split(",");
                            for(int i = 0 ; i < aux.length ; i ++){
                                listaNombres.add(aux[i]);
                            }
                        }
                        
                        facebook.post(tipo, contenido, listaNombres);
                        
                        break;
                    
                    case 2: //Seguir
                        
                        System.out.println("#####Seguir#####\nIngrese el nombre de usuario a quien quiere seguir");
                        
                        String nombre = leerCarac.nextLine();
                        
                        facebook.follow(nombre);
                        
                        break;
                    
                    case 3: //Compartir
                        
                        System.out.println("######Compartir######\nIngrese la ID de la publicacion que quiere compartir:");
                        int id = leerEntero.nextInt();                        
                        
                        ArrayList<String> listaNombres2 = new ArrayList();
                        System.out.println("Desea publicar en perfil de amigos?\n1. Si\n2. No");
                        int respuesta2 = leerEntero.nextInt();
                        
                        if(respuesta2 == 1){
                            System.out.println("Ingrese los nombres del usuario separados solo por ',':");
                            String nombres = leerCarac.nextLine();
                            String[] aux = nombres.split(",");
                            for(int i = 0 ; i < aux.length ; i ++){
                                listaNombres2.add(aux[i]);
                            }
                        }
                        
                        facebook.share(id, listaNombres2);
                        
                        break;
                    
                    case 4: //Visualizar
                        String stringUsuario = facebook.visualize();
                        System.out.println(stringUsuario);
                        break;
                    case 5: //Salir de la cuenta
                        facebook.logout();
                        System.out.println("Saliendo de la cuenta.");
                        break;
                    default:
                        System.out.println("Opcion no valida. Ingrese una opcion valida.");
                        break;
                    
                }
                
            }    
        }while(opcion != 0);
        
        leerEntero.close();
        leerCarac.close();    
    }   
}
