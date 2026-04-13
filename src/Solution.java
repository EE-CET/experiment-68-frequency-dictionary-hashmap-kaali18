import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] words = line.split("\\s+");
                Map<String, Integer> map = new HashMap<>();
                for (String word : words) {
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
                
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
