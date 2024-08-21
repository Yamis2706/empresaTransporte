package co.edu.uniquindio.empresaTransporte;

import co.edu.uniquindio.empresaTransporte.model.EmpresaTransporte;
import co.edu.uniquindio.empresaTransporte.model.Propietario;
import co.edu.uniquindio.empresaTransporte.model.VehiculoCarga;
import co.edu.uniquindio.empresaTransporte.model.VehiculoPasajero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmpresaTransporte empresaTransporte = inicializarDatos();

        System.out.print("Ingrese el número mínimo de ejes para mostrar vehículos: ");
        int ejes = scanner.nextInt();
        mostrarVehiculosCargaMayorEje(empresaTransporte, ejes);

        System.out.print("Ingrese el peso mínimo (kg) para listar usuarios que superan ese peso: ");
        double peso = scanner.nextDouble();
        mostrarUsuariosQueSuperanPeso(empresaTransporte, peso);

        System.out.print("Ingrese la placa del vehículo para mostrar el número de usuarios transportados: ");
        String placa = scanner.nextLine();
        mostrarNumeroUsuariosPorPlaca(empresaTransporte, placa);

        mostrarPropietariosMayoresDe40(empresaTransporte);
    }

    private static void mostrarVehiculosCargaMayorEje(EmpresaTransporte empresaTransporte, int ejes) {
        for (Propietario propietario: empresaTransporte.getListaPropietarios()) {
            for (VehiculoCarga vehiculo: propietario.getListaVehiculosAsociados()) {
                if(vehiculo.getNumeroEjes() >= ejes){
                    System.out.println(vehiculo.toString());
                }
            }
        }
    }

    private static EmpresaTransporte inicializarDatos() {
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        Propietario propietario = new Propietario();
        propietario.setNombre("Pedro");
        propietario.setEdad(45);
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Ana");
        propietario2.setEdad(30);

        VehiculoCarga vehiculoCarga1 = new VehiculoCarga();
        vehiculoCarga1.setPlaca("RRD098");
        vehiculoCarga1.setNumeroEjes(5);
        vehiculoCarga1.setCapacidadCarga(4000);

        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setPlaca("XXX096");
        vehiculoCarga2.setNumeroEjes(3);
        vehiculoCarga2.setCapacidadCarga(2000);

        VehiculoCarga vehiculoCarga3 = new VehiculoCarga();
        vehiculoCarga3.setPlaca("77X096");
        vehiculoCarga3.setNumeroEjes(5);
        vehiculoCarga3.setCapacidadCarga(3500);

        propietario.setVehiculo(vehiculoCarga1);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga2);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga3);

        propietario2.setVehiculo(vehiculoCarga2);

        empresaTransporte.getListaPropietarios().add(propietario2);
        empresaTransporte.getListaPropietarios().add(propietario2);

        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga2);
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga3);

        return empresaTransporte;
    }

    private static void asociarVehiculo() {
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setPlaca("ABC123");
        vehiculoCarga.setModelo("2020");
        vehiculoCarga.setMarca("Volvo");
        vehiculoCarga.setColor("Blanco");
        vehiculoCarga.setCapacidadCarga(2000);
        vehiculoCarga.setNumeroEjes(4);

        Propietario propietario = new Propietario();
        propietario.setNombre("Carlos López");
        propietario.setNumeroIdentificacion("98765432");
        propietario.setEmail("carlos@example.com");
        propietario.setNumeroCelular("3109876543");

        propietario.setVehiculo(vehiculoCarga);
        System.out.println("Propietario creado: " + propietario.getNombre() +
                " con vehículo de placa: " + vehiculoCarga.getPlaca());
    }

    private static void calcultarTotalPasajeros() {
        VehiculoPasajero bus1 = new VehiculoPasajero();
        bus1.setNumeroMaximoPasajeros(40);

        VehiculoPasajero bus2 = new VehiculoPasajero();
        bus2.setNumeroMaximoPasajeros(30);

        List<VehiculoPasajero> vehiculos = new ArrayList<>();
        vehiculos.add(bus1);
        vehiculos.add(bus2);
        int[] viajesPorVehiculo = {15, 23};

        int totalPasajeros = calcularTotalPasajeros(vehiculos, viajesPorVehiculo);
        System.out.println("Total de pasajeros transportados en el día: " + totalPasajeros);
    }

    public static int calcularTotalPasajeros(List<VehiculoPasajero> vehiculos, int[] viajesPorVehiculo) {
        int totalPasajeros = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            totalPasajeros += vehiculos.get(i).getNumeroMaximoPasajeros() * viajesPorVehiculo[i];
        }
        return totalPasajeros;
    }

    private static void mostrarUsuariosQueSuperanPeso(EmpresaTransporte empresaTransporte, double peso) {
        for (Propietario propietario : empresaTransporte.getListaPropietarios()) {
            for (VehiculoCarga vehiculo : propietario.getListaVehiculosAsociados()) {
                if (vehiculo.getCapacidadCarga() > peso) {
                    System.out.println("Propietario: " + propietario.getNombre() +
                            ", Vehículo: " + vehiculo.getPlaca() + ", Capacidad: "
                            + vehiculo.getCapacidadCarga());
                }
            }
        }
    }

    private static void mostrarNumeroUsuariosPorPlaca(EmpresaTransporte empresaTransporte, String placa) {
        for (Propietario propietario : empresaTransporte.getListaPropietarios()) {
            for (VehiculoPasajero vehiculo :
                    propietario.getListaVehiculosAsociadosPasajeros()) {
                if (vehiculo.getPlaca().equals(placa)) {
                    int numeroUsuarios = vehiculo.getNumeroMaximoPasajeros();
                    System.out.println("El vehículo con placa " + placa + " " +
                            "transportó la cantidad de " + numeroUsuarios +
                            " " +
                            "usuarios.");
                }
            }
        }
    }

    private static void mostrarPropietariosMayoresDe40(EmpresaTransporte empresaTransporte) {
        int count = 0;
        for (Propietario propietario : empresaTransporte.getListaPropietarios()) {
            if (propietario.getEdad() > 40) {
                count++;
            }
        }
        System.out.println("Número de propietarios mayores de 40 años: " + count);
    }
}
