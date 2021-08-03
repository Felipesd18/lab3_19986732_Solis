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
    
    //Metodo que se encarga de agregar un usuario a la lista de usuarios y setear su ID a la correspondiente
    public void addUsuario(Usuario usuario){ 
        usuario.setId(listaDeUsuarios.size() + 1);
        listaDeUsuarios.add(usuario);
    }
    
    //Metodo que se encarga de calcular el tamanio del arreglo
    public int tamanio(){
        return listaDeUsuarios.size();
    }
    
    //Metodo que se encarga de obtener a un usuario en la posicion i
    public Usuario getUsuario(int i){
        return listaDeUsuarios.get(i);
    }
    
    //Metodo que se encarga de buscar a un usuario activo en la lista de usuarios
    public int usuarioActivo(){
        
        for (int i = 0; i < listaDeUsuarios.size() ; i++){
            if(listaDeUsuarios.get(i).sesion){
                return i;
            }
        }      
        return -1;
    }
}
