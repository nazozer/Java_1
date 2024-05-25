import java.util.Scanner;
import java.util.Random;

public class Array{
    public static void main(String[] args){
        Scanner scan= new Scanner (System.in);
        System.out.println("Please enter the dimension of the array=");
        int dimension= scan.nextInt();

        int[] myArray = new int [dimension];
        Random random = new Random();

        for (int i=0; i<dimension; i++){
            myArray[i]=random.nextInt(91) +10;

            System.out.println("Array with random values between 10 and 100");

            for (int num: myArray){
                System.out.println(num + " ");

            }
            System.out.println();
            scan.close();
        }
    }
}