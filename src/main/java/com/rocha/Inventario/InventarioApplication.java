package com.rocha.Inventario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rocha.Inventario.entity.Producto;
import com.rocha.Inventario.repository.ProductoRepository;

@SpringBootApplication
public class InventarioApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public void run(String... args) throws Exception {
	}

}
