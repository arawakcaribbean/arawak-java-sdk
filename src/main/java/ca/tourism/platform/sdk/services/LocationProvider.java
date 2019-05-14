package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.location.Location;
import ca.tourism.platform.sdk.entity.page.CustomPage;
import ca.tourism.platform.sdk.exceptions.HttpException;

import java.util.List;

/**
 * Created by ups on 9/05/19.
 */
public class LocationProvider {

    private RestClientProvider restClientProvider ;

    public LocationProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Location createLocation(Location location) throws HttpException {
        return restClientProvider.post("/api/v1/locationProvider/locations", Location.class, location);
    }

    public Location updateLocation(Location location, String id) throws HttpException {
        return restClientProvider.put("/api/v1/locationProvider/locations/" + id, Location.class, location);
    }

    public String deleteLocationById(String id) throws HttpException {
        return restClientProvider.delete("/api/v1/location/locations/" + id , String.class);
    }

    public Location getLocationById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/" + id , Location.class);
    }

    public List<Location> getAllLocation() throws HttpException {
        return restClientProvider.get("/api/v1/location/locations", List.class);
    }

    public Long countOfLocations() throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/size", Long.class);
    }

    public List<Location> getLocationsNearTo(double latitude, double longitude, double distance, String unit) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/nearplaces/"+latitude+"/"+longitude+"/"+distance+"/"+unit, List.class);
    }

    public List<Location> getLocationsByCountryName(String countryName, int page, int size) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/bycountry/" + countryName + "?page="+page+"&size="+size, List.class);
    }

    public List<Location> getLocationsByCountryName(String query) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/_search?query="+query, List.class);
    }

    public boolean verifyIfLocationExist(String id) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/exists/" + id, Boolean.class);
    }

    public List<Location> findByResourceIdIn(List<String> ids) throws HttpException {
        return restClientProvider.post("/api/v1/location/locations/by/resource/ids", List.class,ids);
    }

    public Location findByResourceId(String id) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/by/resource/" + id, Location.class);
    }

    public List<Location> findByIdIn(List<String> ids) throws HttpException {
        return restClientProvider.post("/api/v1/location/locations/by/ids", List.class,ids);
    }

    public CustomPage<Location> getLocationsByCountryId(String countryId, int page, int size) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/page/by/country/"+countryId + "?page="+page+"&size="+size, CustomPage.class);
    }

    public List<Location> getLocationsByCountryId(String countryId) throws HttpException {
        return restClientProvider.get("/api/v1/location/locations/by/country/" + countryId, List.class);
    }

}
