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
    
    //Atributos de la clase usuario
    String nombre; //Variable que guardara el nombre de un usuario
    String contrasenia; //Variable que guardara la contrasenia de un usuario
    int id; //Varibale que guardara la ID de un usuario
    ArrayList<String> listaSeguidos; //Lista de nombres de usuarios a quien sigue el usuario
    ArrayList<String> listaSeguidores; //Lista de nombres de usuarios a quien le siguen el usuario
    ListaDePublicaciones listaPublicaciones; //Lista de publicaciones que ha creado o compartido el usuario
    String fechaCreacion; //Fecha que indica cuando fue creado el usuario
    Boolean sesion; //Variable que indica si un usuario esta activo o no
    
    //Constructor del usuario
    public Usuario(){
        this.nombre = "";
        this.contrasenia = "";
        this.id = 0;
        this.listaSeguidos = new ArrayList();
        this.listaSeguidores = new ArrayList();
        this.listaPublicaciones = new ListaDePublicaciones();
        this.fechaCreacion = "";
        this.sesion = false;
    }
    
    //Selectores de la clase usuario
    
    public String getNombre(){ //Metodo que selecciona el nombre del usuario
        return nombre;
    }
    
    public String getContrasenia(){ //Metodo que selecciona la contrasenia del usuario
        return contrasenia;
    }
    
    public int getID(){ //Metodo que selecciona la ID del usuario
        return id;
    }
    
    public ArrayList<String> getListaSeguidos(){ //Metodo que selecciona la lista de seguidos del usuario
        return listaSeguidos;
    }
    
    public ArrayList<String> getListaSeguidores(){ //Metodo que selecciona la lista de seguidores del usuario
        return listaSeguidores;
    }
    
    public ListaDePublicaciones getListaPublicaciones(){ //Metodo que selecciona la lista de publicaciones del usuario
        return listaPublicaciones;
    }
    
    public String getFecha(){ //Metodo que selecciona la fecha de creacion del usuario
        return fechaCreacion;
    }
    
    public Boolean getSesion(){ //Metodo que selecciona la sesion del usuario
        return sesion;
    }
    
    //Modificadores de la clase usuario    

    public void setNombre(String nombre) { //Metodo que modifica el nombre de un usuario
        this.nombre = nombre;
    }

    public void setContrasenia(String contrasenia) { //Metodo que modifica la contrasenia de un usuario
        this.contrasenia = contrasenia;
    }

    public void setId(int id) { //Metodo que modifica la id de un usuario
        this.id = id;
    }

    public void setListaSeguidos(ArrayList<String> listaSeguidos) { //Metodo que modifica la lista de seguidos de un usuario
        this.listaSeguidos = listaSeguidos;
    }

    public void setListaSeguidores(ArrayList<String> listaSeguidores) { //Metodo que modifica la lista de seguidores de un usuario
        this.listaSeguidores = listaSeguidores;
    }

    public void setListaPublicaciones(ListaDePublicaciones listaPublicaciones) { //Metodo que modifica la lista de publicaciones de un usuario
        this.listaPublicaciones = listaPublicaciones;
    }

    public void setFechaCreacion(String fechaCreacion) { //Metodo que modifica la fecha de un usuario
        this.fechaCreacion = fechaCreacion;
    }

    public void setSesion(Boolean sesion) { //Metodo que modifica la sesion de un usuario
        this.sesion = sesion;
    }  
}