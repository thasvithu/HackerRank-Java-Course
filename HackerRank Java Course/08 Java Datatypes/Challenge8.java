import java.util.Scanner;

public class Challenge8{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++){
            try{
                long n = scanner.nextLong();
    
                System.out.println(n + " can be fitted in:");
    
            
                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }    
        }
    }
}

