import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Two number addition programmer");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter number a: ");
        int a = sc.nextInt();
        System.out.println("Inter number b: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of Two number: "+sum);

    }
}
