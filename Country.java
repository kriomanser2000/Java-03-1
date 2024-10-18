import java.util.ArrayList;
import java.util.Scanner;

public class Country
{
    private String countryName;
    private String continent;
    private long population;
    private String countryCode;
    private String capital;
    private ArrayList<String> cities;
    public Country()
    {
        cities = new ArrayList<>();
    }
    public Country(String countryName, String continent, long population, String countryCode, String capital, ArrayList<String> cities)
    {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.countryCode = countryCode;
        this.capital = capital;
        this.cities = cities;
    }
    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter country name: ");
        this.countryName = scanner.nextLine();
        System.out.println("Enter continent: ");
        this.continent = scanner.nextLine();
        System.out.println("Enter population: ");
        this.population = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter country code: ");
        this.countryCode = scanner.nextLine();
        System.out.println("Enter capital: ");
        this.capital = scanner.nextLine();
        System.out.println("Enter how much need add: ");
        int cityCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cityCount; i++)
        {
            System.out.println("Enter city name " + (i + 1) + ":");
            String city = scanner.nextLine();
            cities.add(city);
        }
    }
    public void outputData()
    {
        System.out.println("Country: " + countryName);
        System.out.println("Continent: " + continent);
        System.out.println("Population: " + population);
        System.out.println("Phone code: " + countryCode);
        System.out.println("Capital: " + capital);
        System.out.println("Cities: " + String.join(", ", cities));
    }
    public String getCountryName()
    {
        return countryName;
    }
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
    public String getContinent()
    {
        return continent;
    }
    public void setContinent(String continent)
    {
        this.continent = continent;
    }
    public long getPopulation()
    {
        return population;
    }
    public void setPopulation(long population)
    {
        this.population = population;
    }
    public String getCountryCode()
    {
        return countryCode;
    }
    public void setCountryCode(String countryCode)
    {
        this.countryCode = countryCode;
    }
    public String getCapital()
    {
        return capital;
    }
    public void setCapital(String capital)
    {
        this.capital = capital;
    }
    public ArrayList<String> getCities()
    {
        return cities;
    }
    public void setCities(ArrayList<String> cities)
    {
        this.cities = cities;
    }
    public void addCity(String city)
    {
        this.cities.add(city);
    }
    public void removeCity(String city)
    {
        this.cities.remove(city);
    }
    public static void main(String[] args)
    {
        Country country = new Country();
        country.inputData();
        country.outputData();
    }
}
