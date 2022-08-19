
/**
 *
 * @author godoy
 */
public class Jugadores {
    private String nombreUsuario;
    private int ID;
    private String password;
    private Personaje personaje;

    public Jugadores(String nombreUsuario, int ID, String password, Personaje personaje) {
        this.nombreUsuario = nombreUsuario;
        this.ID = ID;
        this.password = password;
        this.personaje = personaje;
    }

    public Jugadores() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombreUsuario=" + nombreUsuario + ", ID=" + ID + ", password=" + password + ", personaje=" + personaje + '}';
    }
    
    
}
