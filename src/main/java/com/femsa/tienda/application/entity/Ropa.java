package com.femsa.tienda.application.entity;

public class Ropa extends Producto {
    public Ropa(String nombre, double precio, int inventario) {
        super(nombre, precio, inventario);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Ropa: " + nombre + ", Precio: " + precio);
    }
}
