package com.rocha.Inventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rocha.Inventario.entity.Producto;
import com.rocha.Inventario.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.listarProductos());
        return "productos";
    }

    @GetMapping("/nuevo")
    public String nuevoProductoForm(Model model) {
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        return "nuevo_producto";
    }

    @PostMapping
    public String guardarProducto(@ModelAttribute("producto") Producto producto, Model model) {
        productoService.guardarProducto(producto);
        return "redirect:/productos/";
    }

    @GetMapping("/actualizar/{id}")
    public String actualizaProductoForm(@PathVariable Long id, Model model) {
        model.addAttribute("producto", productoService.obtenerProductoPorId(id));
        return "actualizar_producto";
    }

    @PostMapping("/{id}")
    public String actualizarProducto(@PathVariable Long id, @ModelAttribute("producto") Producto producto, Model model) {
        Producto productoExistente = productoService.obtenerProductoPorId(id);
        productoExistente.setId(id);
        productoExistente.setNombreProducto(producto.getNombreProducto());
        productoExistente.setDescripcionProducto(producto.getDescripcionProducto());
        productoExistente.setPrecioProducto(producto.getPrecioProducto());
        productoExistente.setStockProducto(producto.getStockProducto());
        productoExistente.setIndicadorProducto(producto.getIndicadorProducto());

        productoService.actualizarProducto(productoExistente);
        return "redirect:/productos/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/productos/";
    }

}
