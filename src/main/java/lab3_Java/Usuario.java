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
    
    /**
     * Metodo que selecciona el nombre del usuario
     * @return nombre del usuario
     */
    public String getNombre(){ //Metodo que selecciona el nombre del usuario
        return nombre;
    }
    
    /**
     * Metodo que selecciona la contrasenia del usuario
     * @return contrasenia del usuario
     */
    public String getContrasenia(){ 
        return contrasenia;
    }
    
    /**
     * Metodo que selecciona la ID del usuario
     * @return id del usuario
     */
    public int getID(){
        return id;
    }
    
    /**
     * Metodo que selecciona la lista de seguidos del usuario
     * @return lista seguidos del usuario
     */
    public ArrayList<String> getListaSeguidos(){
        return listaSeguidos;
    }
    
    /**
     * Metodo que selecciona la lista de seguidores del usuario
     * @return lista seguidores del usuario
     */
    public ArrayList<String> getListaSeguidores(){ 
        return listaSeguidores;
    }
    
    /**
     * Metodo que selecciona la lista de publicaciones del usuario
     * @return lista publicaciones del usuario
     */
    public ListaDePublicaciones getListaPublicaciones(){
        return listaPublicaciones;
    }
    
    /**
     * Metodo que selecciona la fecha de creacion del usuario
     * @return fecha de creacion del usuario
     */
    public String getFecha(){ 
        return fechaCreacion;
    }
    
    /**
     * Metodo que selecciona la sesion del usuario
     * @return sesion del usuario
     */
    public Boolean getSesion(){ 
        return sesion;
    }
    
    //Modificadores de la clase usuario    

    /**
     * Metodo que modifica el nombre de un usuario
     * @param nombre al cual se quiere setear el usuario
     */
    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }
    
    /**
     * Metodo que modifica la contrasenia de un usuario
     * @param contrasenia al cual se quiere setear el usuario
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /**
     * Metodo que modifica la id de un usuario
     * @param id al cual se quiere setear el usuario
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Metodo que modifica la lista de seguidos de un usuario
     * @param listaSeguidos al cual se quiere setear el usuario
     */
    public void setListaSeguidos(ArrayList<String> listaSeguidos) {
        this.listaSeguidos = listaSeguidos;
    }
    
    /**
     * Metodo que modifica la lista de seguidores de un usuario
     * @param listaSeguidores al cual se quiere setear el usuario
     */
    public void setListaSeguidores(ArrayList<String> listaSeguidores) {
        this.listaSeguidores = listaSeguidores;
    }

    /**
     * Metodo que modifica la lista de publicaciones de un usuari
     * @param listaPublicaciones al cual se quiere setear el usuario
     */
    public void setListaPublicaciones(ListaDePublicaciones listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    /**
     * Metodo que modifica la fecha de un usuario
     * @param fechaCreacion al cual se quiere setear el usuario
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Metodo que modifica la sesion de un usuario
     * @param sesion al cual sen quiere setear el usuario
     */
    public void setSesion(Boolean sesion) {
        this.sesion = sesion;
    }
    
    /**
     * Metodo que consulta si la lista de nombres dada son nombre de usuarios a quienes sigue el usuario
     * @param listaNombres a los cuales se preguntara si sigue el usuario
     * @return true si el usuario sigue a los usuario
     * @return false si el usuario no sigue a los usuarios
     */
    public boolean sigueAUsuarios(ArrayList<String> listaNombres){
        
        if(listaSeguidos.size() == 0){
            return false;
        }
        
        for(int i = 0; i < listaNombres.size(); i++){
            for(int j = 0; j < listaSeguidos.size(); j++){
                if(listaNombres.get(i).equals(listaSeguidos.get(j))){
                    j = listaSeguidos.size();
                }else if(j == listaSeguidos.size() - 1){
                    return false;
                }
                
            }
        }
        
        return true;
    }
}