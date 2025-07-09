package tercera_parte.ventas;

public class Producto {
    private static int conadorProducto = 0;
    private final int idProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.idProducto = ++Producto.conadorProducto;
        this.nombre = nombre;
        this.precio = precio;

    }



    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getIdProducto() {
        return this.idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + this.idProducto +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                '}';
    }
}
