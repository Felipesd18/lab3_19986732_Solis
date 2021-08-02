/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

/**
 *
 * @author Felipe Solís
 */
public class Publicacion {
    
    int id;
    String contenido;
    String tipo;
    String fechaRealizado;
    String nombreAutor;
    ListaDeReacciones listaReacciones;

    public Publicacion(){
        this.id = 0;
        this.contenido = "";
        this.tipo = "";
        this.fechaRealizado = "";
        this.nombreAutor = "";
        this.listaReacciones = new ListaDeReacciones();
    }

    //Selectores de publicacion
    
    public int getId() { //Metodo para obtener la id de la publicacion
        return id;
    }

    public String getContenido() { //Metodo para obtener el contenido de la publicacion
        return contenido;
    }

    public String getTipo() { //Metodo para obtener el tipo de publicacion
        return tipo;
    }

    public String getFechaRealizado() { //Metodo para obtener la fecha de la publicacion
        return fechaRealizado;
    }

    public String getNombreAutor() { //Metodo para obtener el nombre del autor de la publicacion
        return nombreAutor;
    }

    public ListaDeReacciones getListaReacciones() { //Metodo para pbtener la lista de reacciones de la publicacion
        return listaReacciones;
    }
    
    //Modificadores de publicacion

    public void setId(int id) { //Metodo para modificar el id de la publicacion
        this.id = id;
    }

    public void setContenido(String contenido) { //Metodo para modificar el contenido de la publicacion
        this.contenido = contenido;
    }

    public void setTipo(String tipo) { //Metodo para modificar el tipo de publicacion
        this.tipo = tipo;
    }

    public void setFechaRealizado(String fechaRealizado) { //Metodo para modificar la fecha de la publicacion
        this.fechaRealizado = fechaRealizado;
    }

    public void setNombreAutor(String nombreAutor) { //Metodo para modificar el autor de la publicacion
        this.nombreAutor = nombreAutor;
    }

    public void setListaReacciones(ListaDeReacciones listaReacciones) {//Metodo para modificar la lista de reacciones de la publicacion
        this.listaReacciones = listaReacciones;
    }  
}
