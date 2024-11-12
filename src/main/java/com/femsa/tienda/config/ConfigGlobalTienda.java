package com.femsa.tienda.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigGlobalTienda {
    private double impuesto = 0.16;

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
}
