package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("sentencia de decicsion en java");
        //las sentencias nos permiten controlar el flujo de ejecucion de un programa
        int edad = 13;
        if(edad>=18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad< 18) {
            System.out.println("Eres un adolecente");

        }else{
                System.out.println("Eres menor de edad");
            }
            System.out.println("Fin del programa");

}

}