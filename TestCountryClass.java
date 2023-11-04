import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class TestCountryClass {
    public static void main(String[] args){
        List<Country> countries = new ArrayList<>();

        countries.add(new Country("Germany", 579023, 5.3));
        countries.add(new Country("USA", 331450000, 3.3));
        countries.add(new Country("China", 1439323776, 1.4));
        countries.add(new Country("Russia", 143839483, 6.9));
        countries.add(new Country("Italy", 283483984, 6.2));
        countries.add(new Country("Ukraine", 247783, 3.35));

        Country largestAreaCountry = Collections.max(countries, Comparator.comparing(Country::getCountryArea));
        Country largestPopulationCountry = Collections.max(countries, Comparator.comparing(Country::getCountryName));
        Country largestPopulationDensityCountry = Collections.max(countries, Comparator.comparing(Country::getCountryName));

        System.out.println("The country with the largest area is " + largestAreaCountry.getCountryName());
        System.out.println("The country with the largest population is " + largestPopulationCountry.getCountryName());
        System.out.println("The country with the largest population density is " + largestPopulationDensityCountry.getCountryName());

    }
}
