package com.example.app_final.entity;

import java.sql.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "piezasfabricadas")
public class Piezas {

    @Id
    @GeneratedValue
    private int id_piezas;

    @ManyToOne()
    @JoinColumn(name = "id_ciudad")
    private Ciudad ciudad;

    private String nombre;
    private int cantidad;

    @NonNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern ="yyyy-MM-dd")
    private Date fecha;

    public Piezas(int id_piezas, Ciudad ciudad, String nombre, int cantidad, Date fecha) {
        this.id_piezas = id_piezas;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Piezas() {
    }

    public int getId_piezas() {
        return id_piezas;
    }

    public void setId_piezas(int id_piezas) {
        this.id_piezas = id_piezas;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    
    
}
