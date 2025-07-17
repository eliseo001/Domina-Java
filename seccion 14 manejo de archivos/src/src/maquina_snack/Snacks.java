package maquina_snack;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("papas",70));
        snacks.add(new Snack("refresco",50));
        snacks.add(new Snack("sandwich",120));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var invertarioSnacks = "";
        for (var snack : snacks){
            invertarioSnacks += snack.toString() +"\n";
        }
        System.out.println("---Snacks en el invenario---");
        System.out.println(invertarioSnacks);
    }
    public static  List <Snack> getSnacks(){
        return snacks;
    }
}
