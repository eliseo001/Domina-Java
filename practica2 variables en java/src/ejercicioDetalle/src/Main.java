//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Tienda en linea (detalle de producto");

        String nombre = "fideos";
        double precio = 30.2;
        int cantidad = 2;
        boolean disponibilidad = true;
        System.out.println("producto: " + nombre + "Precios: " + precio + "cantidad: "+ cantidad + "disponibilidad: "+ disponibilidad);


        System.out.println("producto modificado");
        nombre = "carne";
        System.out.println("producto: "+ nombre );
        precio = 2.2;
        System.out.println("precio: "+  precio);
        cantidad = 3;
        System.out.println("cantidad " +cantidad );

        disponibilidad = false;


        System.out.println("disponibilidad = " + disponibilidad);
             }
}