package tercera_parte.prueba_ventas;

import tercera_parte.ventas.Orden;
import tercera_parte.ventas.Producto;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("Sistema de ventas");

        var producto1 = new Producto("Blusa", 30.00);
        var producto2 = new Producto("Zapatos", 50.00);
        var producto3 = new Producto("Remera", 150.00);
        var producto4 = new Producto("Pantalon", 100.00);
        var producto5 = new Producto("Gorro", 20.00);

        System.out.println(producto1);

        System.out.println(producto2);

        //primer objeto de tipó orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);


        orden1.mostrarOrden(); //esto se muestra a traves del metodo mostrarOrden()

        var orden2= new Orden();
        orden2.agregarProducto(new Producto("Playera", 15.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);

        System.out.println(orden2); //esto lo mostramos a traves del metodo toString()
    }
}
