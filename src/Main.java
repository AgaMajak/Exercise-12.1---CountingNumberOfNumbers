import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Integer> listOfNumbers = NumbersOperations.createListOfNumbersFromFile();
        Map<Integer, Integer> numbersMap = NumbersOperations.createMapFromListOfNumbers(listOfNumbers);
        NumbersOperations.printInfoAboutNumbers(numbersMap);

    }
}