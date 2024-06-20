import java.util.Scanner;

public class usAlmaRecursive {
    static int power(int base , int exp){

        int result = 1 ;

        for (int i = 1; i<=exp ; i++){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        int a = input.nextInt();
        System.out.print("Kuvvet değerini giriniz : ");
        int b = input.nextInt();
        System.out.println();
        System.out.println("SONUÇ = " +  power(a,b));


    }
}
