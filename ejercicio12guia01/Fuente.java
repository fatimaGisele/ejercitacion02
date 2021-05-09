/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12guia01;

/**
 *
 * @author Usuario
 */
public class Fuente implements Calificable{
    private String nombre;
    private String path;
    

    public Fuente(String nombre, String path) {
        this.nombre = nombre;
        this.path = path;
    }

    @Override
    public double indiceCalificacion() {
        return 0;
    }
    
}
