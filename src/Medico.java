
/**
 *
 * @author godoy
 */
public class Medico extends Personaje{

    public Medico(String nombre, int vida, int escudo, Armas arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public String toString() {
        return String.format("Medico: %s",super.toString());
    }
    
}
