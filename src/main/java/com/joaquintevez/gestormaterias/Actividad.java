package com.joaquintevez.gestormaterias;

import java.time.LocalDate;

public class Actividad {
    private int id;
    private Materia  materia; 
    private String titulo; 
    private TipoActividad tipo;
    private LocalDate fechaEntrega;
    private EstadoActividad estado;
    private String descripcion;

    public Actividad(int id, Materia materia, String titulo, TipoActividad tipo, LocalDate fechaEntrega, EstadoActividad estado, String descripcion) {
        this.id=id; 
        this.materia = materia;
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.descripcion = descripcion;
    }

      public Actividad(Materia materia, String titulo, TipoActividad tipo, LocalDate fechaEntrega,String descripcion) {
        this.materia = materia;
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.estado = EstadoActividad.PENDIENTE;
        this.descripcion = descripcion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoActividad getTipo() {
        return tipo;
    }

    public void setTipo(TipoActividad tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public EstadoActividad getEstado() {
        return estado;
    }

    public void setEstado(EstadoActividad estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        String fecha = (fechaEntrega != null) ? fechaEntrega.toString() : "sin fecha";
        return "[" + tipo + "] " + titulo + " (" + materia.getNombre() + ")"
                + " - Entrega: " + fecha + " - " + estado;
    }

}


