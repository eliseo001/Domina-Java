public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break y continue");

        for (var i=1;i<10;i++){
            if(i %2==0){
                System.out.println(i);
                //con este break mostraria el primer numero par encontrado
            break;
            }
        }
        System.out.println("continueS");
        for(var num=1;num<10;num++){
            if(num %2 !=0){ //salta los numeros impares y imprime los numeros pares
        continue;
            }
            System.out.println(num);        }
    }
}
