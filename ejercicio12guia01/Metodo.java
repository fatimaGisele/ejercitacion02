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
public class Metodo implements Calificable{
    private String nombre;
    private int parametros;
    private int cantInstrucciones;
    private int ramiFlujo;
    private static final int INDICE_1 = 5;
    private static final int INDICE_2 = 1;
    private static final int INDICE_3 = 20;
    private static final int INDICE_4 = 3;
    
    public Metodo(String nombre, int parametros, int cantInstrucciones, int ramiFlujo) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.cantInstrucciones = cantInstrucciones;
        this.ramiFlujo = ramiFlujo;
    }

    @Override
    public double indiceCalificacion() {
        double indice = (INDICE_1/(this.parametros + INDICE_2)) + (INDICE_3/this.cantInstrucciones)
                        +(INDICE_4/(this.ramiFlujo + INDICE_2)) ;
        return indice;
    }

    public String getNombre() {
        return nombre;
    }

    public int getParametros() {
        return parametros;
    }

    public int getCantInstrucciones() {
        return cantInstrucciones;
    }

    public int getRamiFlujo() {
        return ramiFlujo;
    }
    
}
