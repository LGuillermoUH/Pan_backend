package com.generation.app.panaderia.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ventas_productos")
public class VentasProductos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVentaProducto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pan")
    private Panes panes;

    public Panes getPanes() {
        return panes;
    }

    private int cantidad;

    public int getIdVentaProducto() {
        return idVentaProducto;
    }

    public void setIdVentaProducto(int idVentaProducto) {
        this.idVentaProducto = idVentaProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantida(int cantida) {
        this.cantidad = cantida;
    }

    public static final long serialVersionUID = 1L;
}
