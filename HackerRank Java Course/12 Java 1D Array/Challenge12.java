import java.util.*;

public class Challenge12{
    public static void main(String args[]){
        Scanner Scanner = new Scanner(System.in);
        
        int n = Scanner.nextInt();
        int[] number = new int[n]; 

        for(int i = 0; i < n; i++){
            number[i] = Scanner.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(number[i]);
        }
    }
}