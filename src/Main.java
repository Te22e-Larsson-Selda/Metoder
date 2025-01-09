import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void Hello32(){
        for (int i =0; i < 32; i++){
            System.out.println("Hello world!");
        }
    }
    public static void square(int a){
        System.out.println(a*a);
    }
    public static void multi(float a, float b){
        System.out.println(a*b);
    }
    public static void RightTriangleArea(float a, float b, float c){
        System.out.println((a*b)*c);
    }
    public static void CircalArea(int a){
        System.out.println((a*a) * 3.14);
    }

    public static void getNumber(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Enter a number: ");
                int n = sc.nextInt();
                System.out.println("Your number is: " + n);
                break;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Please try again: ");
            }
        }
    }

    public static void GetChoice(){
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("");
                System.out.println("Enter a choice: ");
            }catch (InputMismatchException e){

            }
        }
    }

    public static void main(String[] args) {
        getNumber();
    }

}