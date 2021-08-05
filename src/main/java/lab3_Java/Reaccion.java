/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

/**
 * Clase que representa a una reaccion
 * Esta clase guarda toda la informacion correspondiente de una reaccion de un usuario hacia una publicacion
 * @author Felipe Solis
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
    
    /**
     * Metodo que seleciona la id de una reaccion
     * @return id de la reaccion
     */
    public int getId() { 
        return id;
    }

    /**
     * Metodo que selecciona el nombre del autor de una reaccion
     * @return nombreAutor de la reaccion
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Metodo que selecciona la fecha de una reaccion
     * @return fechaReaccion de la reaccion
     */
    public String getFechaReaccion() {
        return fechaReaccion;
    }

    /**
     * Metodo que selecciona el contenido de una reaccion
     * @return contenido de la reaccion
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Metodo que selecciona el tipo de una reaccion
     * @return tipo de la reaccion
     */
    public String getTipo() {
        return tipo;
    }

    //Modificadores de la clase Reaccion
    
    /**
     * Metodo que modifica el id de una reaccion
     * @param id que se quiere setear la reaccion
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo que modifica el nombre del autor de una reaccion
     * @param nombreAutor que se quiere setear la reaccion
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     * Metodo que modifica la fecha de una reaccion
     * @param fechaReaccion que se quiere setear la reaccion
     */
    public void setFechaReaccion(String fechaReaccion) {
        this.fechaReaccion = fechaReaccion;
    }

    /**
     * Metodo que modifica el contenido de una reaccion
     * @param contenido que se quiere setear la reaccion
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Metodo que modifica el tipo de una reaccion
     * @param tipo que se quiere setear la reaccion
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * Metodo que se encarga de pasar el contenido de una reaccion a string
     * @return stringReaccion contenido de la reaccion en formato string
     */
    public String pasarAStringReaccion(){
        String stringReaccion = 
                "Tipo de Reaccion: " + tipo +
                "\nID reaccion: " + id +
                "\nAutor: "  + nombreAutor +
                "\nContenido:\n" + contenido;
        return stringReaccion;
    }
    
}
