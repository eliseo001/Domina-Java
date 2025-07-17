package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //leer el archivo creado
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("contenido del archivo: ");
            //abrir el archivo para lñectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //leemos linea la linea
            var linea =  entrada.readLine();
            //leer todas las lineas
            while (linea != null){
                System.out.println(linea);
                //nos movemos a la sigiuente lineas
                linea = entrada.readLine();
            }
            //cerramos archivo
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer el archivo: "+e);
        }
    }
}
