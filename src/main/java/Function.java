import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Function {
    static public List<City> sortByName(List<City> city) {
        city.sort(new ComparatorOne());
        return city;
    }
    static  public List<City> sortByDistrict(List<City> city) {
        city.sort(new ComparatorTwo());
        return city;
    }
    public static String maxPopulation(List<City>cities) {
        City[] aCities = cities.toArray(new City[0]);
        int max = 0;
        int max_i = 0;
        for (int i = 0; i < aCities.length; i++)
            if (aCities[i].getPopulation() > max) {
                max = aCities[i].getPopulation();
                max_i=i;
            }
        return "[" + (max_i+1) + "] = " + max;
    }
    public static void printList(List<City> cities) {
        for (City city : cities) {
            System.out.println(city);
        }
        System.out.println();
    }
    public static void printMap(Map<String,Integer> cities) {
        cities.forEach((key, value) -> System.out.println(key + " - " + value));
    }
    public static Map<String, Integer> amount(List<City> cities) {
        City[] aCities = cities.toArray(new City[0]);
        Map<String, Integer> regions = new HashMap<>();
        for (int i = 0; i < aCities.length; i++) {
            if (!regions.containsKey(aCities[i].getRegion())) {
                regions.put(aCities[i].getRegion(), 0);
            }
        }
        for (int i = 0; i < aCities.length; i++) {
            if (regions.containsKey(aCities[i].getRegion())) {
                regions.put(aCities[i].getRegion(), regions.get(aCities[i].getRegion()) + 1);
            }
        }
        return regions;
    }
}
class ComparatorOne implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());//alphabetically
    }
}

class ComparatorTwo implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        if (!o1.getDistrict().equals(o2.getDistrict())) {
            return o1.getDistrict().compareTo(o2.getDistrict());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
