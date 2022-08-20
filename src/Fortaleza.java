
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
    @Override
    public String nombre(){
        return "Fortaleza";
    }

    @Override
    public void atacar(Jugadores atacante) {
        int damage =(int) (atacante.getPersonaje().getArma().getDamage() - 0.15);
        atacante.getPersonaje().getArma().setDamage(damage);
    }
    
    @Override
    public void extraDamage(Jugadores jugadorAtaque, Jugadores defensor){
        if (defensor.getPersonaje() instanceof Medico) {
            
        }
    }
    

    

    
    
}
