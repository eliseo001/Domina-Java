public class GenerarMail {
    public static void main(String[] args) {
        System.out.println("generar mail preactica");
        var nombre = "Ubaldo acosta soto";
        var nombreNormalizado = nombre.strip();
        nombreNormalizado = nombreNormalizado.replace(" ",".").toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        //datos empresa
        var empresa = "global mentoring";
        var dominio = "com.mex";

        var empresaNomalizado = empresa.strip().replace(" ", ".").toLowerCase();
        System.out.println("empresaNomalizado = " + empresaNomalizado);
        var dominioNormalizado = "@"+ nombreNormalizado + dominio;
        System.out.println("dominioNormalizado = " + dominioNormalizado);

        var emailNomalizado = nombreNormalizado + "@"+dominio;
        System.out.println("emailNomalizado = " + emailNomalizado);

    }
}
