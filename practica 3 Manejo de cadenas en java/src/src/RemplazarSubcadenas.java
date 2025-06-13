public class RemplazarSubcadenas {
    public static void main(String[] args) {
        System.out.println("Remplzar subcaddenas");
        var cadena = "Hola mundo";
        System.out.println("cadena original = " + cadena);

        /// remplazo subcadena mundo a todos
        var nuevaCadena = cadena.replace("mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //remplazar subcadena hola por adios    
        nuevaCadena = cadena.replace("Hola", "saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
