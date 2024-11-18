package com.napier.sem;

/**
 * Class representing a CountryLanguage
 */
public class CountryLanguage {

    /** Country code associated with language */
    public String CountryCode;

    /** Language spoken in the country */
    public String Language;

    /** IS language is official ('T' for true, 'F' for false) */
    public String IsOfficial;

    /** Percentage of population that speaks the language */
    public double Percentage;

    /**
     * Constructs a new CountryLanguage object with the provided data.
     *
     * @param CountryCode Country code (3-character)
     * @param Language    Language spoken in the country
     * @param IsOfficial  Is language is official ('T' for true, 'F' for false)
     * @param Percentage  Percentage of population that speaks the language
     */
    public CountryLanguage(String CountryCode, String Language, String IsOfficial, double Percentage) {
        this.CountryCode = CountryCode;
        this.Language = Language;
        this.IsOfficial = IsOfficial;
        this.Percentage = Percentage;
    }

    /**
     * Method to retrieve the Country Code of a CountryLanguage object.
     * @return Country Code of the object.
     */
    public String getCountryCode() {
        return CountryCode;
    }

    /**
     * Method to retrieve the Language of a CountryLanguage object.
     * @return Language of the object.
     */
    public String getLanguage() {
        return Language;
    }

    /**
     * Method to retrieve if the language is official or not of a CountryLanguage object.
     * @return If the language is official or not of the object.
     */
    public String getIsOfficial() {
        return IsOfficial;
    }

    /**
     * Method to retrieve the Percentage of a CountryLanguage object.
     * @return Percentage of the object.
     */
    public double getPercentage() {
        return Percentage;
    }

    /**
     * Returns a string representation of the CountryLanguage object
     *
     * @return A string containing the country's language information
     */
    @Override
    public String toString() {
        return "CountryLanguage{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }
}

