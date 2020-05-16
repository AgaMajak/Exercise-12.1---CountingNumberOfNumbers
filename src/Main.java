import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> listOfNumbers = NumbersOperations.createListOfNumbersFromFile();
        Map<Integer, Integer> numbersMap = NumbersOperations.createMapFromListOfNumbers(listOfNumbers);
        NumbersOperations.printInfoAboutNumbers(numbersMap);
    }
}







