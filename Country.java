// 3.	Design and implement a class Country that stores the name of the country, its population, and its area. 
// Then write a program that reads in a set of countries and prints
// • The country with the largest area.
// • The country with the largest population.
// • The country with the largest population density (people per square kilometer (or mile)).

public class Country{
    private String name;
    private long population;
    private double area;

    public Country(String name, long population, double area){
         this.name = name;
         this.area = area;
         this.population = population;
    }

    public String getCountryName(){
        return this.name;
    }

    public double getCountryArea() {
        return this.area;
    }

    public long getCountryPopulation(){
        return this.population;
    }

    public double getPopulationDensity(){
        return population / area;
    }

}