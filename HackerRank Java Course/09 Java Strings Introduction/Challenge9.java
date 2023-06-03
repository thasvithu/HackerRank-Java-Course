import java.util.Scanner;

public class Challenge9{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        int sum = length1 + length2;

        boolean isGreater = str1.compareTo(str2) > 0;

        String capitalizedStr1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String capitalizedStr2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        System.out.println(sum);
        System.out.println(isGreater ? "Yes" : "No");
        System.out.println(capitalizedStr1 + " " + capitalizedStr2);
    }
}
