
/**
 *
 * @author godoy
 */
public class Fortaleza extends Personaje{

    public Fortaleza(String nombre, int vida, int escudo, Armas arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public String toString() {
        return String.format("Fortaleza: %s",super.toString());
    }
    
}
