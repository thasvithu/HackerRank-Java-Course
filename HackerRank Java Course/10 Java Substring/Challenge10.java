import java.util.Scanner;

public class Challenge10{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(s.substring(a,b));
    }
}