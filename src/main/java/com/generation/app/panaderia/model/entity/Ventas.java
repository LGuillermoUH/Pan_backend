package com.generation.app.panaderia.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ventas")
public class Ventas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuarios usuario;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "id_venta")
    private List<VentasProductos> ventasProductos;
    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    private int tipoPago;
    public Ventas() {
        ventasProductos=new ArrayList<VentasProductos>();
    }
    public Usuarios getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    @PrePersist
    public void prePersit(){
        fechaVenta=new Date();
    }


    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public List<VentasProductos> getVentasProductos() {
        return ventasProductos;
    }
    public Double getTotal(){
        Double total=0.0;
        int items= ventasProductos.size();
        for (int i=0;i<items;i++){
            total+=ventasProductos.get(i).getCantidad()*ventasProductos.get(i).getPanes().getPrecioPan();
        }
        return total;
    }
    public void setVentasProductos(List<VentasProductos> ventasProductos) {
        this.ventasProductos = ventasProductos;
    }
    public  void  addVentasProducto(VentasProductos ventasProductos1){
        ventasProductos.add(ventasProductos1);
    }
    public static final long serialVersionUID = 1L;
}
