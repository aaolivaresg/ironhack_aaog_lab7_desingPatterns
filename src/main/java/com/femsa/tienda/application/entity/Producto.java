package com.femsa.tienda.application.entity;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int inventario;

    protected Producto(String nombre, double precio, int inventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.inventario = inventario;
    }

    public abstract void mostrarInfo();

    public void reducirInventario(int cantidad) {

        this.inventario -= cantidad;
    }

    public int getInventario() {

        return inventario;
    }

    public String getNombre() {
        return nombre;
    }
}
