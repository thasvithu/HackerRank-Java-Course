import java.util.Scanner;

public class challange3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            }
            else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }
             else {
                System.out.println("Not Weird");
            }
        }
    }
}
