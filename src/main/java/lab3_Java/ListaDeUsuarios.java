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
    
    //Metodo que se encarga de preguntar si existe un usuario con el mismo nombre o contrasenia en la lista
    public Boolean existeUsuario(String nombre, String contrasenia){ 
        
        String nombreUsuario; //Variable que guardara el nombre del usuario temporalmente de la lista
        String contraseniaUsuario; //Variable que guardara la contrasenia del usuario temporalmente de la lista
        
        for(int i=0; i < listaDeUsuarios.size() ; i++){ //Recorremos la lista con el for  
            nombreUsuario = listaDeUsuarios.get(i).getNombre(); //Guardamos el nombre del usuario de la posicion i
            contraseniaUsuario = listaDeUsuarios.get(i).getContrasenia(); //Guardamos la contrasenia del usuario en la posicion i
            
            if((nombreUsuario.equals(nombre)) || (contraseniaUsuario.equals(contrasenia))){ //Preguntamos si el nombre o la contrasenia recien obtenidas con iguales a las que son proporsionadas
                return true;
            }
        }
        return false;
    }
}
