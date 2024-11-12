package com.femsa.tienda.application.service;

import com.femsa.tienda.application.observer.InterfazUsuario;
import com.femsa.tienda.application.observer.ObservableProducto;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class CompraService {
    private final InterfazUsuario interfazUsuario;

    public CompraService(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    @Async
    public void realizarCompra(ObservableProducto observableProducto, int cantidad) {
        observableProducto.addObserver(interfazUsuario);
        observableProducto.venderProducto(cantidad);
        System.out.println("Compra procesada de forma asíncrona.");
    }
}
