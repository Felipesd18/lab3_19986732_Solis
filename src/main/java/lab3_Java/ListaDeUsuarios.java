/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

import java.util.ArrayList;

/**
 * Clase que permite guardar el objeto Usuario y manipular sus datos
 * Esta clase servira para poder guardar, buscar, preguntar y manipular objetos del tipo usuario
 * @author Felipe Solís
 */
public class ListaDeUsuarios {
    
    //Atributo de la clase ListaDeUsuarios
    ArrayList<Usuario> listaDeUsuarios = new ArrayList();
    
    /**
     * Metodo que se encarga de agregar un usuario a la lista de usuarios y setear su ID a la correspondiente
     * @param usuario que se quiere agregar en la lista
     */
    public void addUsuario(Usuario usuario){ 
        usuario.setId(listaDeUsuarios.size() + 1);
        listaDeUsuarios.add(usuario);
    }
    
    /**
     * Metodo que se encarga de calcular el tamanio de la lista
     * @return Tamanio de la lista de usuarios
     */
    public int tamanio(){
        return listaDeUsuarios.size();
    }

    /**
     * Metodo que se encarga de obtener a un usuario en la posicion i
     * @param i posicion en la que se quiere buscar al usuario
     * @return usuario que se buscaba
     */
    public Usuario getUsuario(int i){
        return listaDeUsuarios.get(i);
    }
    
    /**
     * Metodo que se encarga de buscar si existe un usuario con un nombre
     * @param nombre del usuario a quien se quiere buscar
     * @return -1 indicando que no se encontro el usuario con el nombre o i indicando la posicion en la lista de usuarios del usuario con el nombre
     */
    public int getUsuarioPorNombre(String nombre){
        
        for(int i = 0; 0 < listaDeUsuarios.size(); i++){
            if(listaDeUsuarios.get(i).nombre.equals(nombre)){
                return i;
            }                    
        }
        return -1;
    }
    
    /**
     * Metodo que se encarga de buscar y obtener a un usuario activo en la lista de usuarios
     * @return -1 indicando que no se encontro un usuario activo en la lista de usuarios o i indicando la posicion en donde se encontro a un usuario activo de la lista de usuarios
     */
    public int getUsuarioActivo(){
        
        for (int i = 0; i < listaDeUsuarios.size() ; i++){
            if(listaDeUsuarios.get(i).sesion){
                return i;
            }
        }      
        return -1;
    }
    
    /**
     * Metodo que se encarga de pasar a string la lista de usuarios
     * @return stringListaUsuarios con el contenido de la lista de usuarios en string
     */
    public String pasarAStringListaUsuarios(){
        String stringListaUsuarios = "";
        
        for(int i = 0; i < listaDeUsuarios.size() ; i++){
            stringListaUsuarios = stringListaUsuarios + "####################\n" + listaDeUsuarios.get(i).pasarAStringUsuario() + "####################\n";
        }
        
        return stringListaUsuarios;
    }
}
