package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {

            //revisar si existe el archivpo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            var nuevoContenido ="Nuevo\ncontenido";
            salida.println(nuevoContenido);
            //guardamos la info en el archivo
            salida.close();
            System.out.println("Se agrego contenido al archivo\n"+ nuevoContenido);
        }catch (Exception e){
            System.out.println("Error al excribir al archivo: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
