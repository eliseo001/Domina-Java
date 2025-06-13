public class busquedaSubcadena {
    public static void main(String[] args) {
        System.out.println("busqueda de subcadena");
        //indexOf - devuelve el indice de la primer cadena aparicion
        var cadena1 = "hola mundo";
        
        var indice = cadena1.indexOf("hola");
        System.out.println("indice = " + indice);
        //lastindexof - devuleve el indeice de la ultima aparicion de la subacadena
        var indice2 = cadena1.lastIndexOf("mundo");
        System.out.println("indice2 = " + indice2);
        
        //subcadena no encontrada devuelve  - 1
        var indice3 = cadena1.indexOf("java");
        System.out.println("indice3 = " + indice3);//devuelve -1 por que no encuentra la subacadena
        
    }
}
