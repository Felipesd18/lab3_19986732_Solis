/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

/**
 * Clase que representa a una reaccion
 * Esta clase guarda toda la informacion correspondiente de una reaccion de un usuario hacia una publicacion
 * @author Felipe
 */
public class Reaccion {
    
    //Atributos de la clase Reacciones
    int id; //Variable que guarda la id de la reaccion
    String nombreAutor; //Variable que guarda el nombre del usuario que reaccion
    String fechaReaccion; //Fecha de cuando se realizo la publicacion
    String contenido; //Variable que guarda el contenido de la reaccion
    String tipo; //Variable que guarda la el tipo de reaccion 

    //Constructor de la clase Reaccion
    public Reaccion() {
        this.id = 0;
        this.nombreAutor = "";
        this.fechaReaccion = "";
        this.contenido = "";
        this.tipo = "";
    }

    //Selectores de la clase Reaccion
    
    public int getId() { //Metodo que selecciona la id de una reaccion
        return id;
    }

    public String getNombreAutor() { //Metodo que selecciona el nombre del autor de una reaccion
        return nombreAutor;
    }

    public String getFechaReaccion() { //Metodo que selecciona la fecha de una reaccion
        return fechaReaccion;
    }

    public String getContenido() { //Metodo que selecciona el contenido de una reaccion
        return contenido;
    }

    public String getTipo() { //Metodo que selecciona el tipo de una reaccion
        return tipo;
    }

    //Modificadores de la clase Reaccion
    
    public void setId(int id) { //Metodo que modifica el id de una reaccion
        this.id = id;
    }

    public void setNombreAutor(String nombreAutor) { //Metodo que modifica el nombre del autor de una reaccion
        this.nombreAutor = nombreAutor;
    }

    public void setFechaReaccion(String fechaReaccion) { //Metodo que modifica la fecha de una reaccion
        this.fechaReaccion = fechaReaccion;
    }

    public void setContenido(String contenido) { //Metodo que modifica el contenido de una reaccion
        this.contenido = contenido;
    }

    public void setTipo(String tipo) { //Metodo que modifica el tipo de una reaccion
        this.tipo = tipo;
    }
    
    
    
}
