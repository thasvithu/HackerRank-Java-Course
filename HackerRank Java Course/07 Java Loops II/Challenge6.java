import java.util.Scanner;

public class Challenge6{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        
        for(int i=1; i<=q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for(int j=0; j<n; j++){
                a += (int)Math.pow(2,j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}