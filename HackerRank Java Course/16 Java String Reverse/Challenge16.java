import java.util.Scanner;

public class Challenge16{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        
        char []aArray = A.toCharArray();
        int size = aArray.length;
        boolean flag = true;

        for(int i = 0; i < size/2; i++){
            if(aArray[i] != aArray[size-i-1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag? "Yes" : "No");
    }
}