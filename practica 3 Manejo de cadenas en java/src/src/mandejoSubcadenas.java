public class mandejoSubcadenas {
    public static void main(String[] args) {
        System.out.println("mandejo de subcadenas");
        // tema de subcadenas
        var cadena1= "Hola mundo";
        System.out.println("cadena1 = " + cadena1);
        //subcadena
        var subcadena1= cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(5);
        System.out.println("subacadena2= " + subcadena2);
    }
}
