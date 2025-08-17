package com.rocha.Inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_prod", nullable = false, length = 50)
    private String nombreProducto;

    @Column(name = "desc_prod", length = 250)
    private String descripcionProducto;

    @Column(name = "precio_prod", nullable = false)
    private Double precioProducto;

    @Column(name = "stock_prod", nullable = false)
    private Double stockProducto;

    @Column(name = "indicador_prod", length = 20)
    private String indicadorProducto;

    public Producto() {
    } 

    public Producto(Long id, String nombreProducto, String descripcionProducto, Double precioProducto, 
                    Double stockProducto, String indicadorProducto) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.indicadorProducto = indicadorProducto;
    }

    public Producto(String nombreProducto, String descripcionProducto, Double precioProducto, 
                    Double stockProducto, String indicadorProducto) {
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.indicadorProducto = indicadorProducto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Double getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(Double stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getIndicadorProducto() {
        return indicadorProducto;
    }

    public void setIndicadorProducto(String indicadorProducto) {
        this.indicadorProducto = indicadorProducto;
    }

    public Object getCantidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantidad'");
    }
}
