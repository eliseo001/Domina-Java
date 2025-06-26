public class CicloFor {
    public static void main(String[] args) {
        System.out.println("Ciclo for");
        //for se utiliza para ejecutar repetidadmente un bloque de codigo un numero especifico de veces
        //es especialmente util cuando se conoce de antemano cuantas veces se debe repetir una accion
//la inicializacion se ejecuta una sola vez
        //1 se evalua la condicion si la condicion es verdadera se ejecuta el bloque de codigo
        //2 actualizacion se actualiza al final de cada iteracion
        //se repite el paso 2 y 3 hasta que la condicion sea falsa
        int contador;
        for (contador=1;contador<10;contador++){//se inicializa la variable; se declara una condicion ; actualizacion
            System.out.println(contador);
        }



    }
}
