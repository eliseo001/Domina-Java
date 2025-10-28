package zona_fit;

import java.util.Scanner;

public class validaciones {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Validaciones");

        String name = getName();

        int age = getAge();

        System.out.println("El nombre ingresado es: " + name + " tiene: " + age + " años.");

        sc.close();
    }


    public static String getName()
    {
        System.out.println("ingrese un nombre valido");

        String name = sc.nextLine().trim();
        if (! validName(name)) {
            System.out.println("El nombre debe debe contener solamente letras, al menos 3 carateres y una vocal y no puede esta vacio");

            return getName();
        }

        return name;
    }

    public static boolean validName(String name)
    {
        return  ! name.isEmpty() &&
                name.length() >= 3 &&
                name.matches("[a-zA-Z ]+") &&
                name.toLowerCase().matches(".*[aeiouáéíóú].*")
        ;
    }

    public static int getAge()
    {
        System.out.println("Ingrese su edad");

        int age = sc.nextInt();

        if(! validAge(age)) {
            System.out.println("La edad debe ser positiva entre 0 - 120 años");
            return getAge();
        }

        return age;
    }

     public static boolean validAge(int age)
     {
         return age >= 0 && age <= 120;
     }
}