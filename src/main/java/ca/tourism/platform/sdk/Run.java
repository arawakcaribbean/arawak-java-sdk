package ca.tourism.platform.sdk ;

import ca.tourism.platform.sdk.entity.country.Country;
import ca.tourism.platform.sdk.entity.page.CustomPage;
import ca.tourism.platform.sdk.exceptions.HttpException;
import ca.tourism.platform.sdk.services.CountryProvider;

import java.util.LinkedList;


public class Run {

	public static void main(String[] args) {
		CountryProvider countryProvider = new CountryProvider("eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI3MjAxZDY4ZC02NTA4LTRhNzMtYTRlZi1lMjI0NTgwNTBhYzYifQ.eyJqdGkiOiIzNDg5MGUyZi02YjI0LTRkOWItYWNjYy0zMWEwZTVjOGY1OGMiLCJleHAiOjAsIm5iZiI6MCwiaWF0IjoxNTU3ODQ0Mjg2LCJpc3MiOiJodHRwczovL2NvbnNvbGUub3BlbmNhcmliYmVhbi5vcmcvYXV0aC9yZWFsbXMvYXJhd2FrcyIsImF1ZCI6Imh0dHBzOi8vY29uc29sZS5vcGVuY2FyaWJiZWFuLm9yZy9hdXRoL3JlYWxtcy9hcmF3YWtzIiwidHlwIjoiUmVnaXN0cmF0aW9uQWNjZXNzVG9rZW4iLCJyZWdpc3RyYXRpb25fYXV0aCI6ImF1dGhlbnRpY2F0ZWQifQ.S_Ba0WKuxQerfM7gHZhBySLJPkbdmBQQZztvyBa7Rxs") ;
		Country country = new Country("YadielCountry", "YC", "OK", new LinkedList<String>(), 0.0, 0.0) ;
		try {
			//POST
			Country response = countryProvider.createCountry(country) ;
			System.out.println(response.toString());
			// LIST
			CustomPage<Country> customPage = countryProvider.getAllCountriesByPage(0,10) ;
			System.out.println(customPage.toString());
		} catch (HttpException e) {
			System.out.println("[ERROR] - " + e.getMessage());
		}
	}
}
