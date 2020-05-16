import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NumbersOperations {
    private static final String FILE_NAME = "numbers.txt";
    private static final File FILE = new File(FILE_NAME);

    public static ArrayList<Integer> createListOfNumbersFromFile() throws FileNotFoundException {
        Scanner scan = new Scanner(FILE);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        while (scan.hasNextLine()) {
            Integer value = scan.nextInt();
            listOfNumbers.add(value);
        }
        scan.close();
        return listOfNumbers;
    }

    public static Map<Integer, Integer> createMapFromListOfNumbers(ArrayList<Integer> arrayList) {
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

    private static ArrayList<Integer> createListOfKeys(Map<Integer, Integer> map) {
        return new ArrayList<>(map.keySet());
    }

    public static void printInfoAboutNumbers(Map<Integer, Integer> map) {
        ArrayList<Integer> listOfKeys = createListOfKeys(map);
        for (int j = 0; j < map.size(); j++) {
            System.out.println(listOfKeys.get(j) + " - liczba wystąpień " + map.get(listOfKeys.get(j)));
        }
    }


}
