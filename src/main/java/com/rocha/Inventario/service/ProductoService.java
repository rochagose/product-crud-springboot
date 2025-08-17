package com.rocha.Inventario.service;

import java.util.List;
import com.rocha.Inventario.entity.Producto;


public interface ProductoService {
    public List<Producto> listarProductos();
    public Producto guardarProducto(Producto producto);
    public Producto obtenerProductoPorId(Long id);
    public Producto actualizarProducto(Producto producto);
    public void eliminarProducto(Long id);
}
