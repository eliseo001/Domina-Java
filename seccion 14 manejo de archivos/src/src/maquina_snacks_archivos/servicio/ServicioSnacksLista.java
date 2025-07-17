package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;

    //bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("papas",70));
        snacks.add(new Snack("refresco",50));
        snacks.add(new Snack("sandwich",120));
    }

    public  void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public  void mostrarSnacks(){
        var invertarioSnacks = "";
        for (var snack : snacks){
            invertarioSnacks += snack.toString() +"\n";
        }
        System.out.println("---Snacks en el invenario---");
        System.out.println(invertarioSnacks);
    }
    public List <Snack> getSnacks(){
        return snacks;
    }
}
