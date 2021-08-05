/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_Java;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase para representar la Fecha
 * Esta clase sera utilizada para las clases usuarios y publicaciones
 * Se utilizara para obtener la fecha que se crean los usuarios y las publicaciones
 * @author Felipe Solís
 */

public class Fecha {
    
    private static String tiempoActual; //Variable que guardara en dato String la fecha
    
    /**
     * Metodo para obtener la fecha actual 
     * @return tiempoActual en formato string
     */
    public String obtenerFechaActual(){
        Fecha.actualizarFechaActual(); //Actualizamos la fecha actual con el metodo actualizarFechaActual
        return tiempoActual; //Retornamos el dato String con la representacion de la fecha
    }
    
    /**
     * Metodo para actualizar la fecha actual, ademas de pasar el dato a string 
     */
    public static void actualizarFechaActual(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //Creamos un formato para la fecha
        Date date = new Date(); //Obtenemos la fecha actual
        Fecha.tiempoActual = formatoFecha.format(date); //Pasamos al formato creado la fecha actual
    }
}