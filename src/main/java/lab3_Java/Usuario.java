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
    String nombre;
    String contrasenia;
    int id;
    ArrayList<String> ListaSeguidos;
    ArrayList<String> ListaSeguidores;
    ListaDePublicaciones ListaPublicaciones;
    String fechaCreacion;
    Boolean sesion;
    
    //Constructor del usaurio
    public Usuario(String nombre, String contrasenia, int id){
        
    }
    
}
