/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;

/**
 *  Clase que se usara para representar a las publicaciones
 *  Con esta clase se guardaran todos los datos que corresponden a la publicacion de la red social
 * @author Felipe Solís
 */
public class Publicacion {
    
    //Atributos de la clase Publicacion
    int id;
    String contenido;
    String tipo;
    String fechaRealizado;
    String nombreAutor;
    ListaDeReacciones listaReacciones;

    //Constructor de publicacion
    public Publicacion(){
        this.id = 0;
        this.contenido = "";
        this.tipo = "";
        this.fechaRealizado = "";
        this.nombreAutor = "";
        this.listaReacciones = new ListaDeReacciones();
    }

    //Selectores de publicacion
    
    /**
     * Metodo para obtener la id de la publicacion
     * @return id de la publicacion
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para obtener el contenido de la publicacion
     * @return contenido de la publicacion
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Metodo para obtener el tipo de publicacion
     * @return tipo de la publicacion
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Metodo para obtener la fecha de la publicacion
     * @return fechaRealizado de la publicacion
     */
    public String getFechaRealizado() {
        return fechaRealizado;
    }

    /**
     * Metodo para obtener el nombre del autor de la publicacion
     * @return nombreAutor de la publicacion
     */
    public String getNombreAutor() {
        return nombreAutor;
    }

    /**
     * Metodo para pbtener la lista de reacciones de la publicacion
     * @return listaReacciones de la publicacion
     */
    public ListaDeReacciones getListaReacciones() {
        return listaReacciones;
    }
    
    //Modificadores de publicacion

    /**
     * Metodo para modificar el id de la publicacion
     * @param id que se quiere setear la publicacion
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para modificar el contenido de la publicacion
     * @param contenido que se quiere setear la publicacion
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Metodo para modificar el tipo de publicacion
     * @param tipo que se quiere setear la publicacion
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo para modificar la fecha de la publicacion
     * @param fechaRealizado que se quiere setear la publicacion
     */
    public void setFechaRealizado(String fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    /**
     * Metodo para modificar el autor de la publicacion
     * @param nombreAutor que se quiere setear la publicacion
     */
    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    /**
     * Metodo para modificar la lista de reacciones de la publicacion
     * @param listaReacciones que se quiere setear la publicacion
     */
    public void setListaReacciones(ListaDeReacciones listaReacciones) {
        this.listaReacciones = listaReacciones;
    }
    
    /**
     * Metodo que se encarga de pasar a string el contenido de una publicacion
     * @return stringPublicacion con todo el contenido de la publicacion en string
     */
    public String pasarAStringPublicacion(){
        String stringPublicacion = 
                "Tipo de Publicacion: " + tipo + " Fecha realizado la publicacion: " + fechaRealizado + " ID: " + id +
                "\nAutor: " + nombreAutor +
                "\nContenido:\n" + contenido +
                "\nReacciones:\n" + listaReacciones.pasarAStringListaReacciones();
        return stringPublicacion;
    }
}
