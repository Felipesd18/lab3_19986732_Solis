/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

import java.util.ArrayList;

/**
 *
 * @author Felipe Solís
 */
public class ListaDeUsuarios {
    
    ArrayList<Usuario> listaDeUsuarios = new ArrayList();
    
    public void addUsuario(Usuario usuario){
        listaDeUsuarios.add(usuario);
    }
}
