package com.Transpiedecuesta.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tarifas")
public class Tarifa {

    @Id
    private String id;
    private String rutaId; // ID de la ruta asociada
    private double precio; // Precio de la tarifa

    public Tarifa() {}

    public Tarifa(String rutaId, double precio) {
        this.rutaId = rutaId;
        this.precio = precio;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRutaId() {
        return rutaId;
    }

    public void setRutaId(String rutaId) {
        this.rutaId = rutaId;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

