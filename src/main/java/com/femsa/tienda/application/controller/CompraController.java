package com.femsa.tienda.application.controller;

import com.femsa.tienda.application.entity.Producto;
import com.femsa.tienda.application.factory.ProductoFactory;
import com.femsa.tienda.application.observer.ObservableProducto;
import com.femsa.tienda.application.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    private final ProductoFactory productoFactory;
    private final CompraService compraService;

    @Autowired
    public CompraController(ProductoFactory productoFactory, CompraService compraService) {
        this.productoFactory = productoFactory;
        this.compraService = compraService;
    }

    @PostMapping
    public String comprarProducto(@RequestParam String nombre,
                                  @RequestParam double precio,
                                  @RequestParam int inventario,
                                  @RequestParam int cantidad) {
        Producto producto = productoFactory.crearProducto(nombre, precio, inventario);
        ObservableProducto observableProducto = new ObservableProducto(producto);

        compraService.realizarCompra(observableProducto, cantidad);

        return "Compra en proceso para " + nombre;
    }
}
