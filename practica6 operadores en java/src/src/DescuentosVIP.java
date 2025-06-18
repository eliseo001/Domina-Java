import java.util.Scanner;

public class DescuentosVIP {
    public static void main(String[] args) {
        System.out.println("Descuentos VIP");
        final var NO_PRODUCTOS_DESCUENTO =10;
        var sc = new Scanner(System.in);

        System.out.println("cuantos productos compraste hoy");
        var cantidadProductos = Integer.parseInt(sc.nextLine());

        System.out.println("tienes la membresia de la tienda (true/false)");
        var tienesMembresia = Boolean.parseBoolean(sc.nextLine());
        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;
        System.out.println("Tienes acceso al descueto vip? " + esElegibleDescuento);
        
    }
}
