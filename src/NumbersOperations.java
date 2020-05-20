import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NumbersOperations {
    private static final String FILE_NAME = "numbers.txt";
    private static final File FILE = new File(FILE_NAME);

    public static List<Integer> createListOfNumbersFromFile() throws FileNotFoundException {
        Scanner scan = new Scanner(FILE);
        List<Integer> listOfNumbers = new ArrayList<>();
        while (scan.hasNextLine()) {
            Integer value = scan.nextInt();
            listOfNumbers.add(value);
        }
        scan.close();
        return listOfNumbers;
    }

    public static Map<Integer, Integer> createMapFromListOfNumbers(List<Integer> arrayList) {
        Map<Integer, Integer> numbersMap = new TreeMap<>();
        int i = 0;

        while (i < arrayList.size()) {
            int key = arrayList.get(i);
            if (numbersMap.containsKey(key)) {
                int value = numbersMap.get(key);
                value++;
                numbersMap.put(key, value);
            } else {
                numbersMap.put(key, 1);
            }
            i++;
        }
        return numbersMap;
    }
    
    public static void printInfoAboutNumbers(Map<Integer, Integer> map) {
        for (Integer key : map.keySet()) {
            System.out.println(key + " – liczba wystąpień: " + map.get(key));
        }
    }
}
