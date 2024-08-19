package co.edu.uniquindio.empresaTransporte.model;

public abstract class VehiculoPrincipal {

    private String placa;
    private String modelo;
    private String marca;
    private String color;

    public VehiculoPrincipal (String placa, String modelo, String marca,
                              String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public VehiculoPrincipal() {
    }

    public String getPlaca(String placa) {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

