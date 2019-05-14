package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.bookeable.Bookable;
import ca.tourism.platform.sdk.entity.bookeable.ResourceWithVirtualBookeables;
import ca.tourism.platform.sdk.entity.bookeable.VirtualBookable;
import ca.tourism.platform.sdk.exceptions.HttpException;

import java.util.Date;
import java.util.List;

/**
 * Created by ups on 9/05/19.
 */
public class BookableProvider {

    private RestClientProvider restClientProvider ;

    public BookableProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Bookable createBookable(Bookable bookable) throws HttpException {
        return restClientProvider.post("/api/v1/booking/bookables", Bookable.class, bookable);
    }

    public String deleteBookeable(String id) throws HttpException {
        return restClientProvider.delete("/api/v1/booking/bookables/" + id, String.class);
    }

    public List<Bookable> getAllBookeables() throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookables", List.class);
    }

    public Bookable getBookableById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookables/" + id, Bookable.class);
    }

    public Bookable updateBooking(Bookable bookable) throws HttpException {
        return restClientProvider.put("/api/v1/booking/bookables", Bookable.class, bookable);
    }

    public List<Bookable> getBookeablesByIds(List<String> ids) throws HttpException {
        return restClientProvider.post("/api/v1/booking/bookables/get/multiple", List.class, ids);
    }

    public List<VirtualBookable> findFreeBookeablePlacesBetwenDatesForResource(String resourceid, Date startDate, Date endDate) throws HttpException {
        return restClientProvider.get("/bookables/"+resourceid+"/"+startDate+"/"+endDate, List.class);
    }

    public List<ResourceWithVirtualBookeables> getAllFreeBookablesForListOsResources(List<String> ids, Date startDate, Date endDate) throws HttpException {
        return restClientProvider.post("/bookables/"+startDate+"/"+endDate, List.class, ids);
    }

}
