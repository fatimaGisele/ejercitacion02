package ejercicio12guia01;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Programa implements Calificable{
    private int id;
    private String nombre;
    private Responsable nombreResponsable;
    private boolean pasoUnitTest;
    private ArrayList<Fuente> fuentes;

    public Programa(int id, String nombre, Responsable nombreResponsable, boolean pasoUnitTest) {
        this.id = id;
        this.nombre = nombre;
        this.nombreResponsable = nombreResponsable;
        this.pasoUnitTest = pasoUnitTest;
        this.fuentes = new ArrayList<>();
    }
    
    public void agregarFuente(Fuente f){
        this.fuentes.add(f);
    }
    
    @Override
    public double indiceCalificacion() {
         return this.pasoUnitTest ? promFuentes() : 0;
    }
    
    public double promFuentes(){
        double prom = 0;
        int c = 0;
        for(Fuente f: fuentes){
            prom += f.indiceCalificacion();
            c++;
        }
        return c>0 ? prom/c : 0;
    }
    
    private void mostrarDetalleDelMetodo(String nombre){
        Metodo m = buscarMetodo(nombre);
        if(m==null){
            System.out.println("No se encontro el metodo buscado");
        }else{
            System.out.println("Metodo encontrado: "+m.getNombre()+
            "\n su indice de calidad es: "+m.indiceCalificacion()+" cantidad de parametros: "+m.getParametros()+
            "\n sus ramifucaciones son: "+m.getRamiFlujo()+
             " \n su cantidad de instrucciones son: "+m.getCantInstrucciones());
        }
    }
    
    public Metodo buscarMetodo(String nombre){
        Metodo metEncontrado = null;
        int i=0;
        while(i<this.fuentes.size()&& metEncontrado == null){
            Fuente f = this.fuentes.get(i);
            if(f instanceof FuenteProgramacion){
                metEncontrado = ((FuenteProgramacion) f).buscarMetodo(nombre);
            }
            i++;
        }
        return metEncontrado;
    }
    
    private ArrayList<Fuente> listadoFuentesMayoresAlPromedio(){
        ArrayList<Fuente> fuenteMayProm = new ArrayList<>();
        for(Fuente f: fuentes){
            if(f.indiceCalificacion()>promFuentes()){
                fuenteMayProm.add(f);
            }
        }
        return fuenteMayProm;
    }
}
