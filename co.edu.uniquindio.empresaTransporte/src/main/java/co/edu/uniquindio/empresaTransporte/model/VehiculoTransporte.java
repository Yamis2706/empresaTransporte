package co.edu.uniquindio.empresaTransporte.model;


public class VehiculoTransporte extends VehiculoPrincipal {
    private int maximoPasajeros;

    public VehiculoTransporte() {
    }


    public VehiculoTransporte(String placa, String modelo, String marca, String color,
                              int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public VehiculoTransporte(String maximoPasajeros) {
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

}

