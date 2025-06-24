import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("Sistema de reserva del hotel");
        var sc = new Scanner(System.in);
        final var CUARTO_VISTA_AL_MAR = 190.50;
        final var CUARTO_SIN_VISTA_AL_MAR = 150.50;

        System.out.print("Ingrese su nombre ");
        var cliente = sc.nextLine();
        System.out.print("Ingrese los dias de estadia ");
        var dias = Integer.parseInt(sc.nextLine());
        System.out.print("Quiere un cuarto con vista al mar (true/false) ");
        var vistaMar = Boolean.parseBoolean(sc.nextLine());

        var precioDia = (vistaMar==true? CUARTO_VISTA_AL_MAR:CUARTO_SIN_VISTA_AL_MAR);
        var precioTotal = precioDia*dias;
        System.out.printf("""
                -----Detalle de la Reservación-------
                Cliente: %s
                Dias de estadia: %d
                Costo total: $%.2f 
                Habitacion con vista al mar: %s
                """,cliente,dias,precioTotal,vistaMar);
    }
}
