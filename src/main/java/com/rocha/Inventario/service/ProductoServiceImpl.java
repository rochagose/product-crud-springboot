package com.rocha.Inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocha.Inventario.entity.Producto;
import com.rocha.Inventario.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

}
