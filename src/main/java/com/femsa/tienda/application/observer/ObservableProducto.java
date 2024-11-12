package com.femsa.tienda.application.observer;

import com.femsa.tienda.application.entity.Producto;

import java.util.ArrayList;
import java.util.List;

public class ObservableProducto {
    private final List<Observer> observadores = new ArrayList<>();
    private final Producto producto;

    public ObservableProducto(Producto producto) {
        this.producto = producto;
    }

    public void addObserver(Observer observer) {
        observadores.add(observer);
    }

    public void venderProducto(int cantidad) {
        if (producto.getInventario() >= cantidad) {
            producto.reducirInventario(cantidad);
            notifyObservers("Inventario de " + producto.getNombre() + " actualizado a: " + producto.getInventario());
        } else {
            notifyObservers("Inventario insuficiente para " + producto.getNombre());
        }
    }

    private void notifyObservers(String mensaje) {
        observadores.forEach(observer -> observer.actualizar(mensaje));
    }
}
