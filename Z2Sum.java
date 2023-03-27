import java.util.ArrayList;
import java.util.Scanner;
public class Z2Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var numStr = sc.next();
        var strArr = numStr.split(",");
        var numList = new ArrayList<Integer>();
        
        for (String str : strArr) {
            numList.add(Integer.parseInt(str));
        }
        var result = 0;
        for (Integer value : numList) {
            result += value;
        }
        System.out.println(result);
    }
}
