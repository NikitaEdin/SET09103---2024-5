package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class AppTest {

    static App app;

    @BeforeAll
    /**
     * This initialises the App before all tests in this class are started.
     */
    static void setUpBeforeClass(){
        app = new App();
    }

    @Test
    /**
     * Tests the print_Items method to ensure it handles an empty list without errors.
     */

    void print_ItemsContainsNull(){
        // Create ArrayList
        ArrayList<Country> countries = new ArrayList<Country>();
        // Add null into the ArrayList
        countries.add(null);
        // Call print_Items Method
        app.print_Items(countries);
    }

    @Test
    /**
     * This tests the print_Items method to test if any errors occur if its provided a empty list
     */
    void print_ItemsContainsEmpty(){
        // Create ArrayList
        ArrayList<Country> countries = new ArrayList<Country>();
        // Call print_Items method
        app.print_Items(countries);
    }

    @Test
    /**
     *  This test is to test the method print_Items if it functions without errors with normal data.
     */
    void print_Items(){
        // Create the Country object using the constructor
        Country c = new Country(
                "123", "Scotland", "Europe", "Rainy", 300.0,
                0, 5000000, null, 867.518, 600.629, "Scotland",
                "Government Form", "King", 1, "456"
        );
        // Create ArrayList to store the info
        ArrayList<Country> countries = new ArrayList<>();
        // Add test data to the ArrayList
        countries.add(c);
        // Use print_items method
        app.print_Items(countries);

    }
}
