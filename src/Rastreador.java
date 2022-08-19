

/**
 *
 * @author godoy
 */
public class Rastreador extends Personaje{

    public Rastreador(String nombre, int vida, int escudo, Armas arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public String toString() {
        return String.format("Rastreador: %s",super.toString());
    }
    
}
