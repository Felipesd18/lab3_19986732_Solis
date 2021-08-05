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
    
    /**
     * Metodo que se encarga de buscar una publicacion con la id
     * @param id de la publicacion que se quiere buscar
     * @return i con la posicion en la lista de publicaciones de la publicacion buscada o un -1 si no se encontro la publicacion
     */
    public int getPublicacionPorID(int id){
        
        for(int i = 0 ; i < listaDePublicaciones.size() ; i++){
            if(listaDePublicaciones.get(i).id == id){//Preguntamos si la publicacion actual tiene el mismo id del que se busca
                return i; //Retornamos la posicion de la publicacion encontrada
            }
        }
        return -1; //Indicamos que no se encontro la publicacion
    }
    
}
