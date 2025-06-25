import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("Sistema de envios");
            final var ENVIO_NACIONAL = 10;
            final var ENVIO_INTERNACIONAL = 20;
            double costoEnvio=0;
            var sc = new Scanner(System.in);
        System.out.println("Ingrese el destino (nacional/internacional)");
        var destino = sc.nextLine().toLowerCase();
        System.out.println("Ingrese el peso del paquete en kilogramos");
        var peso = Double.parseDouble(sc.nextLine());

        if(destino.equals("nacional")){
            costoEnvio = ENVIO_NACIONAL*peso;
        } else if (destino.equals("internacional")) {
            costoEnvio = ENVIO_INTERNACIONAL*peso;


        }else {
            System.out.println("Destino desconocido");
        }
        System.out.printf("""
                Destino %s
                Peso %.2f Kilos
                Costo del envio del paquete %.2f
                """,destino,peso,costoEnvio);

        //con switch
        System.out.println("Ingrese destino (nacional/internacional");
        var destino2 = sc.nextLine().strip().toLowerCase();
        System.out.println("INgresa el peso del paquete en (kg)");
        var peso2= Double.parseDouble(sc.nextLine());

        Double costoEnvio2 = switch (destino2){
            case "nacional"-> peso2*ENVIO_NACIONAL;
            case "internacional"-> peso2*ENVIO_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. ingresa (nacional/internacional");
                yield null;
            }


        };
        if(costoEnvio2 !=null)
            System.out.printf("El costo de envio de paquete es: $%.2f",costoEnvio2);

    }
}
