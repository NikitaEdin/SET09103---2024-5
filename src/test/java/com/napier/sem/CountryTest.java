package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import com.napier.sem.Country;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class testing the Country class methods.
 */
class CountryTest {
    // Initialising Country object and variables that will be used to create Country object.
    static private Country country;
    static private String code = "AND";
    static private String name = "Andorra";
    static private String continent = "Europe";
    static private String region = "Southern Europe";
    static private double surfaceArea = 468.00;
    static private int indepYear = 1278;
    static private int population = 78000;
    static private double lifeExpectancy = 83.5;
    static private double gnp = 1630.00;
    static private double gnpOld = 0.0;
    static private String localName = "Andorra";
    static private String governmentForm = "Parliamentary Coprincipality";
    static private String headOfState = "";
    static private Integer capital = 55;
    static private String code2 = "AD";

    /**
     * Sets up the test fixture before all test methods run.
     */
    @BeforeAll
    static void setUpBeforeClass(){
        country = new Country(
                code,
                name,
                continent,
                region,
                surfaceArea,
                indepYear,
                population,
                lifeExpectancy,
                gnp,
                gnpOld,
                localName,
                governmentForm,
                headOfState,
                capital,
                code2 );
    }

    /**
     * Tests the Country class constructor.
     */
    @Test
    void testCountryConstructor(){
        assertEquals(code, country.Code);
        assertEquals(name, country.Name);
        assertEquals(continent, country.Continent);
        assertEquals(region, country.Region);
        assertEquals(surfaceArea, country.SurfaceArea, 0.2);
        assertEquals(lifeExpectancy, country.LifeExpectancy, 0.1);
        assertEquals(gnp, country.GNP, 0.2);
        assertEquals(gnpOld, country.GNPOld, 0.2);
        assertEquals(localName, country.LocalName);
        assertEquals(governmentForm, country.GovernmentForm);
        assertEquals(headOfState, country.HeadOfState);
        assertEquals(capital, country.Capital);
        assertEquals(code2, country.Code2);
    }
}