package zona_fit.objetos;

public class Usuario extends Persona
{
    private String ciudad;

    public Usuario(String nombre, String apellido, int edad, String ciudad) {
        super(nombre, apellido, edad);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString()
    {
        return "Usuario{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    public void presentar()
    {
        System.out.println("Hola soy " + getNombre() + " " + getApellido() + " tengo " + getEdad() + " años y soy de " + getCiudad());
    }

    public static void main(String[] args)
    {
        Usuario usuario1 = new Usuario("Malena", "Perez", 33, "Cordoba");

        usuario1.presentar();
    }
}
