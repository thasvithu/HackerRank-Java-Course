import java.util.Arrays;
import java.util.Scanner;

public class Challenge11 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // get string
        int k = scanner.nextInt();  // get length

        int size = s.length();
        int Asize = size - k + 1;
        String []sArray = new String[Asize];

        for(int i = 0; i < sArray.length; i++){ 
            sArray[i] = s.substring(i, k);
            k++;
        }

        Arrays.sort(sArray);
        System.out.println(sArray[0]);
        System.out.println(sArray[sArray.length - 1]);

        scanner.close();
    }
}
