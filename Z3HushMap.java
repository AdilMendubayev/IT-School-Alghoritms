import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Z3HushMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var words = new ArrayList<String>();

        while (true) {
           var rawWordLine = sc.next();
           if (rawWordLine.equals("stop")) {
               break;      
            }
            var cleanedStrLine = rawWordLine.replaceAll("[^a-zA-Z\\s]+", "");
            cleanedStrLine = rawWordLine.replaceAll("\\s+", " ");

            var wordArr = cleanedStrLine.split(" ");

            for (String str : wordArr) {
                words.add(str);
            }

             
        }

        var wordCountMap = new HashMap<String, Integer>();
        for (var str : words) {
            
            if (wordCountMap.containsKey(str)) {
                var count = wordCountMap.get(str);
                wordCountMap.put(str, count + 1);
            } else {
                wordCountMap.put(str, 1);
                
            }
        }
        System.out.println(wordCountMap);
    }
}
