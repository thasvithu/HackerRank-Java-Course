import java.util.*;

public class Challenge15{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if(-100 < n && n < 100)
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
    }
}

