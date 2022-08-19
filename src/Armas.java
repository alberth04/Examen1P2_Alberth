
/**
 *
 * @author godoy
 */
public class Armas {

    private String nombre;
    private int damage;
    private int precision;

    public Armas(String nombre, int damage, int precision)throws Exception{
        this.nombre = nombre;
        this.damage = damage;
        setPrecision(precision);
    }

    public Armas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) throws Exception {
        if (precision >= 0 && precision < 101) {
            this.precision = precision;
        } else {
            throw new Exception("Fuera del rango");
        }

    }

    @Override
    public String toString() {
        return String.format("Armas: %s Daño %s Precision %s", nombre, damage, precision);
    }

}
