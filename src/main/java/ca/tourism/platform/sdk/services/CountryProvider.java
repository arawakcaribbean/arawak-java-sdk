package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.country.Country;
import ca.tourism.platform.sdk.entity.page.CustomPage;
import ca.tourism.platform.sdk.exceptions.HttpException;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ups on 9/05/19.
 */
public class CountryProvider {

    private RestClientProvider restClientProvider ;

    public CountryProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Country createCountry(Country country) throws HttpException {
        return restClientProvider.post("/api/v1/location/countries", Country.class, country);
    }

    public Country getCountryById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/location/countries/" + id , Country.class);
    }

    public String deleteCountryById(String id) throws HttpException {
        return restClientProvider.delete("/api/v1/location/countries/" + id , String.class);
    }

    public CustomPage<Country> getAllCountriesByPage(int page, int size) throws HttpException {
        return restClientProvider.get("/api/v1/location/countries/list?page=" + page + "&size=" + size , CustomPage.class);
    }

    public CustomPage<Country> searchCountry(String name, int page, int size) throws HttpException {
        return restClientProvider.get("/api/v1/location/countries/search?page=" + page + "&size=" + size + "&name=" + name , CustomPage.class);
    }

}
