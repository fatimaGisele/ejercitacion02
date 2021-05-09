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
public class FuenteProgramacion extends Fuente{
    private ArrayList<Metodo> metodos;

    public FuenteProgramacion(Metodo metodos, String nombre, String path) {
        super(nombre, path);
        this.metodos = new ArrayList<>();
    }
    
    public void agregarMetodo(Metodo met){
        this.metodos.add(met);
    }
    
     public double indiceCalificable(){
         double prom = 0;
         for(Metodo m: metodos){
             prom+= m.indiceCalificacion();
         }
         prom = prom/metodos.size();
        return prom;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }
    
     public Metodo buscarMetodo(String nombre){
         Metodo metEncontrado = null;
         int i=0;
         while(metodos.size()>i && metEncontrado==null){
             Metodo m = this.metodos.get(i);
             if(m.getNombre().equalsIgnoreCase(nombre)){
                 metEncontrado = m;
             }
             i++;
         }
         return metEncontrado;
     }
}
