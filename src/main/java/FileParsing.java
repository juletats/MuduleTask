import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public  class FileParsing {
     public static List<City> read(String path, List<City>cities) {
        try {
            Scanner scanner = new Scanner(new File(path));
            int i = 0;
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] str = s.split(";");
                cities.add(new City(str[1], str[2], str[3], Integer.parseInt(str[4]), Integer.parseInt(str[5])));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cities;
    }
}

