import java.util.Comparator;
import java.util.Objects;

public class City {
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private int foundation;


    public City( String name, String region, String district, int population, int foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public String getRegion() {
        return region;
    }

    public int getPopulation() {
        return population;
    }

    public int getFoundation() {
        return foundation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return id == city.id && population == city.population && foundation == city.foundation && Objects.equals(name, city.name) && Objects.equals(region, city.region) && Objects.equals(district, city.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, region, district, population, foundation);
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String toString(){
        return "City{name='"+name+"', region='"+region +
                "', district='"+district + "', population='"+population+
                "', foundation='"+ foundation+"'}";
    }



}
