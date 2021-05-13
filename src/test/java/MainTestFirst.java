import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainTestFirst {
    String path = "ForTest.txt";
    List<City> result = Arrays.asList(
        (new City("Адыгейск","Адыгея","Южный",12248,1973)),
        (new City("Майкоп","Адыгея","Южный",144246,1857)),
        (new City("Горно-Алтайск","Алтай","Сибирский",56928,1830)),
        (new City("Абаза","Хакасия","Сибирский",17111,1867))
    );
    @Test
    public void First(){
    List<City> citiesFromFile = new ArrayList<>();
    List<City> expected = new ArrayList<>();
    expected.add(new City("Адыгейск","Адыгея","Южный",12248,1973));
    expected.add(new City("Майкоп","Адыгея","Южный",144246,1857));
    expected.add(new City("Горно-Алтайск","Алтай","Сибирский",56928,1830));
    expected.add(new City("Абаза","Хакасия","Сибирский",17111,1867));
    //corr.add(new City("Адыгейск","Адыгея","Южный",12248,1973));
        Assert.assertEquals(expected,  FileParsing.read(path,citiesFromFile));

}
    @Test
    public void checkSortByDistrict(){
        List<City> secondSortResult = Arrays.asList(
                (new City("Адыгейск","Адыгея","Южный",12248,1973)),
                (new City("Майкоп","Адыгея","Южный",144246,1857)),
                (new City("Горно-Алтайск","Алтай","Сибирский",56928,1830)),
                (new City("Абаза","Хакасия","Сибирский",17111,1867))
        );
        List<City> correct = Arrays.asList(
                new City("Абаза","Хакасия","Сибирский",17111,1867),
                new City("Горно-Алтайск","Алтай","Сибирский",56928,1830),
                new City("Адыгейск","Адыгея","Южный",12248,1973),
                new City("Майкоп","Адыгея","Южный",144246,1857)

        );

        Assert.assertEquals(correct,  Function.sortByDistrict(secondSortResult));
    }

    @Test
    public void checkSortByName(){
        List<City> firstSortResult = Arrays.asList(
                (new City("Адыгейск","Адыгея","Южный",12248,1973)),
                (new City("Майкоп","Адыгея","Южный",144246,1857)),
                (new City("Горно-Алтайск","Алтай","Сибирский",56928,1830)),
                (new City("Абаза","Хакасия","Сибирский",17111,1867))
        );
        List<City> correct = Arrays.asList(
                new City("Абаза","Хакасия","Сибирский",17111,1867),
                new City("Адыгейск","Адыгея","Южный",12248,1973),
                new City("Горно-Алтайск","Алтай","Сибирский",56928,1830),
                new City("Майкоп","Адыгея","Южный",144246,1857)
        );

        Assert.assertEquals(correct, Function.sortByName(firstSortResult));
    }
    @Test
    public void checkMaxAmount(){
        String correct ="[" + 2 + "] = " + 144246;
        Assert.assertEquals(correct, Function.maxPopulation(result));
    }
    @Test
    public void check(){
        Map<String,Integer >  expected  = new HashMap<>();
        expected.put("Адыгея",2);
        expected.put("Алтай",1);
        expected.put("Хакасия",1);
        Assert.assertEquals(expected,Function.amount(result));
    }

}

