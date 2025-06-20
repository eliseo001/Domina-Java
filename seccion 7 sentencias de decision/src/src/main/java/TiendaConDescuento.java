import java.util.Scanner;

public class TiendaConDescuento {
    public static void main(String[] args) {
        System.out.println("Tienda con descuentos");
        var sc = new Scanner(System.in);
        System.out.print("Cual fue el monto de tu compra");
        var monto = sc.nextDouble();
        System.out.println("Eres miembro de la tienda (true/false)?");
        boolean miembro =  sc.nextBoolean();

        if (miembro  && monto>1000){
            var descuento1= monto*0.1;
            var pFinal= monto-descuento1;
            System.out.printf("""
                    Felicidades eres miembro de la tienda: 
                    Subtotal: $%.2f
                    Descuento: $%.2f (10%%)
                    Costo de la compra:$%.2f
                    """,monto,descuento1,pFinal);
        } else if (miembro) {
            var descuento1= monto*0.05;
            var pFinal= monto-descuento1;
            System.out.printf("""
                    Felicidades eres miembro de la tienda
                    Subtotal: $%.2f
                    Descuento: $%.2f (5%%)
                    Costo de la compra:$%.2f
                    """,monto,descuento1,pFinal);
        }else{
            System.out.printf("""
                    No califico para ningundescuento
                    Costo de la compra:$%.2f
                    """,monto);
        }
    }
}
