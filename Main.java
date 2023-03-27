import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        var result = reverseByBuilder(str);
        System.out.println(result);

        
    }
    private static String reverseByChars(String sourseStr) {
        var strChars = sourseStr.toCharArray();
        var resultBuilder = new StringBuilder();

        for (int i = sourseStr.length() - 1; i >= 0; i--) {
            resultBuilder.append(strChars);        
        }
        return resultBuilder.toString();
    }
    private static String reverseByBuilder(String sourseStr){
        var strBuilder = new StringBuilder(sourseStr);
        strBuilder.reverse();
        return strBuilder.toString();
    }
}    