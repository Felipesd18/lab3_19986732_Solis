/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

import java.util.ArrayList;

/**
 * Clase que permite guardar el objeto Reaccion y manipular sus datos
 * Esta clase servira para poder guardar, buscar, preguntar y manipular objetos del tipo reaccion
 * @author Felipe
 */
public class ListaDeReacciones {
    
    //Atributo de la clase ListaDeReacciones
    ArrayList<Reaccion> listaDeReacciones = new ArrayList();
    
    //Metodo que se encarga de agregar un usuario a la lista de Reacciones y setear su ID a la correspondiente
    public void addReaccion(Reaccion reaccion){ 
        reaccion.setId(listaDeReacciones.size() + 1);
        listaDeReacciones.add(reaccion);
    }
}
