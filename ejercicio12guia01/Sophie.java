/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12guia01;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Sophie {
    private ArrayList<Programa> programas;

    public Sophie() {
        this.programas = new ArrayList<>();
    }
    
    private void agregarPrograma(Programa p){
        this.programas.add(p);
    }
    
    private String crearInforme(){
        return null;
    }
    
    public ArrayList<Programa> programasPorDebajoDe(int umbralCalidad){
        ArrayList<Programa> listaProg = new ArrayList<>();
        for(Programa p: programas){
            if(p.indiceCalificacion()< umbralCalidad){
                listaProg.add(p);
            }
        }
        return listaProg;
    }
}
