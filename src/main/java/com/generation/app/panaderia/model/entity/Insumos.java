package com.generation.app.panaderia.model.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "insumos")
public class Insumos implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idInsumo;

        private int idProveedor;

        private String nombreInsumo;

        private Double precioInsumo;

        private String cantidadInsumos;

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public Double getPrecioInsumo() {
        return precioInsumo;
    }

    public void setPrecioInsumo(Double precioInsumo) {
        this.precioInsumo = precioInsumo;
    }

    public String getCantidadInsumos() {
        return cantidadInsumos;
    }

    public void setCantidadInsumos(String cantidadInsumos) {
        this.cantidadInsumos = cantidadInsumos;
    }

    public static final long serialVersionUID = 1L;
}
