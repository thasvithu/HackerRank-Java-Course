import java.util.Scanner;

public class Challenge5{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        String java = scanner.next();
        int num1 = scanner.nextInt();
        String cpp = scanner.next();
        int num2 = scanner.nextInt();
        String python = scanner.next();
        int num3 = scanner.nextInt();


        System.out.println("================================");
        System.out.printf("%-15s%03d\n", java, num1);
        System.out.printf("%-15s%03d\n", cpp, num2);
        System.out.printf("%-15s%03d\n", python, num3);
        System.out.println("================================");
    }
}