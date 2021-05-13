import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        String path = "city.txt";
        Function.printList( FileParsing.read(path,cities)); //firstTask
        System.out.println("Sorted list by name:");
        Function.printList( Function.sortByName(cities));
        System.out.println("Sorted list by district:");
        Function.printList( Function.sortByDistrict(cities));
        System.out.println("Max population:");
        System.out.println(Function.maxPopulation(cities));
        System.out.println("Amount of districts in one region:");
        Function.printMap(Function.amount(cities));
    }
}
