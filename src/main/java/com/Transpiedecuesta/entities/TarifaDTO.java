package com.Transpiedecuesta.entities;

public class TarifaDTO {
    private String id;         // ID de la tarifa
    private String rutaId;     // ID de la ruta asociada
    private String rutaNombre; // Nombre de la ruta
    private double precio;     // Precio de la tarifa

    // Constructor completo
    public TarifaDTO(String id, String rutaId, String rutaNombre, double precio) {
        this.id = id;
        this.rutaId = rutaId;
        this.rutaNombre = rutaNombre;
        this.precio = precio;
    }

    // Constructor vacío
    public TarifaDTO() {}

    // Getters y setters
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

    public String getRutaNombre() {
        return rutaNombre;
    }

    public void setRutaNombre(String rutaNombre) {
        this.rutaNombre = rutaNombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "TarifaDTO{" +
               "id='" + id + '\'' +
               ", rutaId='" + rutaId + '\'' +
               ", rutaNombre='" + rutaNombre + '\'' +
               ", precio=" + precio +
               '}';
    }

    // Método equals para comparar objetos por contenido
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TarifaDTO tarifaDTO = (TarifaDTO) o;

        if (Double.compare(tarifaDTO.precio, precio) != 0) return false;
        if (!id.equals(tarifaDTO.id)) return false;
        if (!rutaId.equals(tarifaDTO.rutaId)) return false;
        return rutaNombre.equals(tarifaDTO.rutaNombre);
    }

    // Método hashCode para usarse en colecciones basadas en hash
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id.hashCode();
        result = 31 * result + rutaId.hashCode();
        result = 31 * result + rutaNombre.hashCode();
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
