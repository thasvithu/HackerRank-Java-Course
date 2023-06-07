import java.util.Scanner;

public class AnotherMethode{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
  
        int size = A.length();
        boolean flag = true;

        for(int i = 0; i < size/2; i++){
            if(A.charAt(i) != A.charAt(size-i-1)){
                flag = false;
                break;
            }
        }
        System.out.println(flag? "Yes" : "No");
    }
}
