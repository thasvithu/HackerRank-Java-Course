import java.util.Scanner;

public class Challenge6{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (i * n));
        }
    }
}