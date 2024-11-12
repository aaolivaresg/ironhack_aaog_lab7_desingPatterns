package com.femsa.tienda.application.factory;

import com.femsa.tienda.application.entity.Producto;
import com.femsa.tienda.application.entity.Ropa;
import org.springframework.stereotype.Component;

@Component
public class ProductoFactory {
    public Producto crearProducto(String nombre, double precio, int inventario) {
        return new Ropa(nombre, precio, inventario); // Ejemplo para solo ropa
    }
}
