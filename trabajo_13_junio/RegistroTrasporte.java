package trabajosPinto.trabajo_13_junio;

import java.util.ArrayList;
import java.util.List;

public class RegistroTrasporte {
    private List<Vehiculo> ambulancias;
    private List<Vehiculo> carrosFunebres;

    public RegistroTrasporte() {
        ambulancias = new ArrayList<>();
        carrosFunebres = new ArrayList<>();
    }

    public void agregarAmbulancia(Vehiculo ambulancia) {
        ambulancias.add(ambulancia);
    }

    public void agregarCarroFunebre(Vehiculo carroFunebre) {
        carrosFunebres.add(carroFunebre);
    }

    public void mostrarReporte() {
        System.out.println("REPORTE DE AMBULANCIAS");
        for (Vehiculo amb : ambulancias) {
            amb.mostrarInfo();
            System.out.println();
        }
        System.out.println("REPORTW DE CARRO FUNEBRE");
        for (Vehiculo carro : carrosFunebres) {
            carro.mostrarInfo();
            System.out.println();
        }
    }
}
