package com.femsa.tienda.application.observer;

import org.springframework.stereotype.Component;

@Component
public class InterfazUsuario implements Observer {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("UI: " + mensaje);
    }
}
