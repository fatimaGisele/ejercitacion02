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
public class FuenteMarcado extends Fuente{
    private double tamArchivo;
    private static final int INDICE_CALIDAD = 450;
    
    public FuenteMarcado(String nombre, String path, double tam) {
        super(nombre, path);
        tamArchivo = tam;
    }
    
    public double indiceCalificable(){
        return this.tamArchivo/INDICE_CALIDAD;
    }

  
}
