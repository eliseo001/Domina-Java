import java.util.Scanner;

public class TIketVentra {
    public static void main(String[] args) {
        System.out.println("Generacion de ticket venta");

        var sc = new Scanner(System.in);
        System.out.println("precio leche: ");
        var precioLeche = Double.parseDouble(sc.nextLine());

        System.out.println("precio pan: ");
        var precioPan = Double.parseDouble(sc.nextLine());

        System.out.println("precio lechuga: ");
        var precioLechuga = Double.parseDouble(sc.nextLine());

        System.out.println("precio platanos: ");
        var precioPlatano = Double.parseDouble(sc.nextLine());

        System.out.println("Aplicar algun descuento (%)? ");
        var descuentoPorcentaje= Integer.parseInt(sc.nextLine());


        // calcular subtotal sin impuestos
        var subtotal = precioLeche+precioLechuga+precioPan+precioPlatano;

        //aplicar el descuento
        var descuento = subtotal *(descuentoPorcentaje/100.0);

        //subtotal con descueto
        var subtotalConDescuento = subtotal-descuento;
        //calculo con impuestos (21%)
        var impuesto = subtotalConDescuento * .21;
        // calculo total de la compra  (con impuestos)
        var costoTotalCompra = subtotalConDescuento+ impuesto;

        //imprimir tiket de venta
        System.out.printf("""
                %nTiket de venta
                %n------------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto: (21%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal,descuento,descuentoPorcentaje, impuesto, costoTotalCompra);


    }
}
