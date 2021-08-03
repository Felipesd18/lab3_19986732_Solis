/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

import java.util.ArrayList;

/**
 * Interfaz que simulara el comportamiento de una RedSocial
 * Esta interfaz esta encargada de crear metodos que utiliza una red social
 * @author Felipe
 */
public interface RedSocial {
    
    //Atributos
    ListaDeUsuarios listaUsuarios = new ListaDeUsuarios();
    ListaDePublicaciones listaPublicaciones = new ListaDePublicaciones();
    
    public int authentication(String nombre, String contrasenia);
    public void register(String Nombre, String contrasenia);
    public void login(String nombre, String contrasenia);
    public void logout();
    public void post(String tipo, String contenido, ArrayList<String> listaNombres);
    public void share(int id, ArrayList<String> listaNombres);
    public void visualize();
}
