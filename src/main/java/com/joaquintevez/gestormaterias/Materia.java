package com.joaquintevez.gestormaterias;

public class Materia {
    private int id;
    private String nombre;
    private String cuatrimestre;


    //Constructor for Material
    public Materia(int id, String nombre, String  cuatrimestre) {
        this.id = id;
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
    }

    //Constructor for Material without id
     public Materia(String nombre, String  cuatrimestre) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
    }




    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String  cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    @Override
    public String toString() {
    return nombre + " (" + cuatrimestre + ")";
    }
}
