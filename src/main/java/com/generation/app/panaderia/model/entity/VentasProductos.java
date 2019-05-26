package com.generation.app.panaderia.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "ventas_productos")
public class VentasProductos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVentaProducto;
    @NotNull
    private int idVenta;
    @NotNull
    private int idPan;
    @NotNull
    private int cantida;

    public int getIdVentaProducto() {
        return idVentaProducto;
    }

    public void setIdVentaProducto(int idVentaProducto) {
        this.idVentaProducto = idVentaProducto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdPan() {
        return idPan;
    }

    public void setIdPan(int idPan) {
        this.idPan = idPan;
    }

    public int getCantida() {
        return cantida;
    }

    public void setCantida(int cantida) {
        this.cantida = cantida;
    }

    public static final long serialVersionUID = 1L;
}
