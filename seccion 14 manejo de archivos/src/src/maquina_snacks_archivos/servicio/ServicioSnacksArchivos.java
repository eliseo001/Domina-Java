package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioSnacksArchivos implements IServicioSnacks {

    private final String NOMBRE_ARCHIVO ="snacks.txt";
    //crear la lista de snacks+
    private List<Snack> snacks =new ArrayList<>();

    //constructor de la clase
    public ServicioSnacksArchivos(){
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try {
            existe= archivo.exists();
            if (existe){
                this.snacks = obtenerSnacks();
            }else{
                var salida=new PrintWriter(new FileWriter(archivo));
                salida.close();//guarda el archivo en el disco
                System.out.println("Se ha creado el archivo");
            }

        }catch (Exception e){
            System.out.println("Error al crear el archivo"+ e.getMessage());
        }
        //si no existe, cargamos algunos snack de manera inicial
        if(!existe){
            cargarSnacksIniciales();
        }
    }
    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sanguche",130));

    }
    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));

            for (String linea:lineas){
               String[] lineaSnack = linea.split(","); //parseo separado por una coma
               var idSnack =lineaSnack[0];//no se usa
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                var snack= new Snack(nombre,precio);
                snacks.add(snack);//agrega el snak leido a la lista
            }

        } catch (Exception e) {
            System.out.println("Error al leer archivo de snacks"+e.getMessage());
            e.printStackTrace();
        }
        return snacks;
    }
    @Override
    public void agregarSnack(Snack snack) {
        //agregamos el nuevo snack 1. a la lista a memoria
        this.snacks.add(snack);
        //2. guardamos el nuevo snack en el archivo
        this.agregarSnackArchivo(snack);
    }
    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter((new FileWriter(archivo,anexar)));
            salida.println(snack.escribirSnack());

            salida.close();//se escribe la informaciuon en el archivo
        } catch (Exception e) {
            System.out.println("error al agregar el snack: "+ e.getMessage());
        }
    }


    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el inventario ---");
        var inventariosSnacks="";
        for (var snack: this.snacks){
            inventariosSnacks+= snack.toString()+"\n";
        }
        System.out.println(inventariosSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
