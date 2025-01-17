package com.napier.sem;

/**
 * Class representing a City from CITY table in the database.
 */
public class City {

    /** Unique ID of the city. */
    public int ID;

    /** Name of the city. */
    public String Name;

    /** Country code the city belongs to. */
    public String CountryCode;

    /** District the city is located in. */
    public String District;

    /** Population of the city. */
    public int Population;

    /**
     * Constructs new City object with the provided data.
     *
     * @param ID         Unique ID of the city.
     * @param Name       Mame of the city.
     * @param CountryCode Country code the city belongs to.
     * @param District   District the city is located in.
     * @param Population Population of the city.
     */
    public City(int ID, String Name, String CountryCode, String District, int Population) {
        this.ID = ID;
        this.Name = Name;
        this.CountryCode = CountryCode;
        this.District = District;
        this.Population = Population;
    }

    /**
     * Method to retrieve the City ID of the object.
     * @return City ID of the object.
     */
    public int getID() {
        return ID;
    }

    /**
     * Method to retrieve the Name of the city.
     * @return Name of the City.
     */
    public String getName() {return Name;}

    /**
     * Method to retrieve the Country Code of the object.
     * @return Country Code of the object.
     */
    public String getCountryCode() {return CountryCode;}

    /**
     * Method to retrieve the District of the object.
     * @return District of the object.
     */
    public String getDistrict() {return District;}

    /**
     * Method to retrieve the Population of the object.
     * @return Population of the object.
     */
    public int getPopulation() {return Population;}

    /**
     * Returns a string representation of the City object.
     *
     * @return A string containing the city's information.
     */
    @Override
    public String toString() {
        return "City{" +
                "Name='" + Name + '\'' +
                ", Country='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }
}

