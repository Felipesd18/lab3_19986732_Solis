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
 * @author Felipe Sol�s
 */
public class ListaDePublicaciones {
    
    //Atributo de la clase ListaDePublicaciones;
    ArrayList<Publicacion> listaDePublicacion = new ArrayList();
    
    //Metodo que se encarga de agregar una publicacion a la lista de publicacion y setear su ID a la correspondiente
    public void addPublicaccion(Publicacion publicacion){ 
        publicacion.setId(listaDePublicacion.size() + 1);
        listaDePublicacion.add(publicacion);
    }
    
}
