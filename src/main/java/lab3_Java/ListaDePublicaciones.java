/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

import java.util.ArrayList;

/**
 * Clase que permite guardar el objeto Publicacion y manipular sus datos
 * Esta clase servira para poder guardar, buscar, preguntar y manipular objetos del tipo publicacion
 * @author Felipe Solís
 */
public class ListaDePublicaciones {
    
    //Atributo de la clase ListaDePublicaciones;
    ArrayList<Publicacion> listaDePublicaciones = new ArrayList();
    
    //Metodo que se encarga de agregar una publicacion a la lista de publicacion y setear su ID a la correspondiente
    
    /**
     * Metodo que se encarga de agregar una publicacion a la lista de pulicaciones y setear su ID a la correspondiente
     * @param publicacion 
     */
    public void addPublicaccion(Publicacion publicacion){ 
        publicacion.setId(listaDePublicaciones.size() + 1);
        listaDePublicaciones.add(publicacion);
    }
    
    /**
     * Metodo que se encarga de obtener una publicacion en la posicion i de la lista de publicaciones
     * @param i posicion en donde se quiere obtener la publicacion
     * @return La publicacion buscada
     */
    public Publicacion getPublicacion(int i){
        return listaDePublicaciones.get(i);
    }
    
    /**
     * Metodo que se encarga de calcular el tamanio de la lista
     * @return Tamanio de la lista de usuarios
     */
    public int tamanio(){
        return listaDePublicaciones.size();
    }
    
}
