/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;
import java.util.ArrayList;

/**
 * Esta clase sera la encargada de representar a un usuario
 * Sera ocupada para guardar toda la informacion de un usuario
 * @author Felipe Solís
 */
public class Usuario {
    //Atributos del usuario
    String nombre; //Variable que guardara el nombre de un usuario
    String contrasenia; //Variable que guardara la contrasenia de un usuario
    int id; //Varibale que guardara la ID de un usuario
    ArrayList<String> listaSeguidos; //Lista de nombres de usuarios a quien sigue el usuario
    ArrayList<String> listaSeguidores; //Lista de nombres de usuarios a quien le siguen el usuario
    ListaDePublicaciones listaPublicaciones; //Lista de publicaciones que ha creado o compartido el usuario
    String fechaCreacion; //Fecha que indica cuando fue creado el usuario
    Boolean sesion; //Variable que indica si un usuario esta activo o no
    
    //Constructor del usuario
    public Usuario(String nombre, String contrasenia, int id, String fecha){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.id = id;
        this.listaSeguidos = new ArrayList();
        this.listaSeguidores = new ArrayList();
        this.listaPublicaciones = new ListadePublicaciones();
        this.fechaCreacion = fecha;
        this.sesion = false;
    }
    
    //Selectores de la clase usuario
    
    public String obtenerNombre(){ //Selector que obtiene el nombre del usuario
        return nombre;
    }
    
    public String obtenerContrasenia(){ //Selector que obtiene la contrasenia del usuario
        return contrasenia;
    }
    
    public int obtenerID(){ //Selector que obtiene la ID del usuario
        return id;
    }
    
    public ArrayList<String> obtenerListaSeguidos(){ //Selector que obtiene la lista de seguidos del usuario
        return listaSeguidos;
    }
    
    public ArrayList<String> obtenerListaSeguidores(){ //Selector que obtiene la lista de seguidores del usuario
        return listaSeguidores;
    }
    
    public ListaDePublicaciones obtenerListaPublicaciones(){ //Selector que obtiene la lista de publicaciones del usuario
        return listaPublicaciones;
    }
    
    public String obtenerFecha(){ //Selector que obtiene la fecha de creacion del usuario
        return fechaCreacion;
    }
    
    public Boolean obtenerSesion(){ //Selector que obtiene la sesion del usuario
        return sesion;
    }
}