import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Un numero para los primos que hay entre cero y tu numero");
        int num = sc.nextInt();

        //primos
        while (num != 0) {
            if (num == 2 || num == 3 || num == 5 || num == 7) {
                System.out.println(num);
                num--;
            }else if (num%2!=0 && num%3!=0 && num%5!=0 && num%7!=0){
                //Posible numero primo :D
                int PosibleMultiplo = num/2;
                while (PosibleMultiplo!=0){
                    while (num%PosibleMultiplo!=0){
                        PosibleMultiplo--;
                    }
                    if (num%PosibleMultiplo==0 && PosibleMultiplo==1){
                        System.out.println(num);
                    }
                    PosibleMultiplo = 0;
                }
                num--;
            }else{
                num--;
            }
        }

        /*

         */

        System.out.println("Los numeros pares que hay entre cero y tu numero");
        int numero = sc.nextInt();

        //pares
        while (numero != 0){
            if (numero % 2 == 0) {
                System.out.println(numero);
                numero--;
            }else{
                numero--;
            }
        }
    }
}