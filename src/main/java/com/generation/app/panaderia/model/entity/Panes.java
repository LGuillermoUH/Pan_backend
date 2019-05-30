package com.generation.app.panaderia.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "panes")
public class Panes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPan;

    private String nombrePan;

    private String categoriaPan;

    private Double precioPan;

    private int stockPan;

    private String url;

    private String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdPan() {
        return idPan;
    }

    public void setIdPan(int idPan) {
        this.idPan = idPan;
    }

    public String getNombrePan() {
        return nombrePan;
    }

    public void setNombrePan(String nombrePan) {
        this.nombrePan = nombrePan;
    }

    public String getCategoriaPan() {
        return categoriaPan;
    }

    public void setCategoriaPan(String categoriaPan) {
        this.categoriaPan = categoriaPan;
    }

    public Double getPrecioPan() {
        return precioPan;
    }

    public void setPrecioPan(Double precioPan) {
        this.precioPan = precioPan;
    }

    public int getStockPan() {
        return stockPan;
    }

    public void setStockPan(int stockPan) {
        this.stockPan = stockPan;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static final long serialVersionUID = 1L;
}
