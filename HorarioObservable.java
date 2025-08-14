import java.util.ArrayList;
import java.util.List;

public class HorarioObservable {
    private List<Observador> observadors = new ArrayList<>();
    public void  agregarObservador(Observador o){
        observadors.add(o);
    }

    public void notificar(String diaHora){
        for (Observador observador : observadors) {
            observador.actualizar(diaHora);
        }
    }
}
