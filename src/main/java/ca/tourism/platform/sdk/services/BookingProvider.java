package ca.tourism.platform.sdk.services;

import ca.tourism.platform.sdk.core.RestClientProvider;
import ca.tourism.platform.sdk.entity.booking.Booking;
import ca.tourism.platform.sdk.entity.booking.BookingSimple;
import ca.tourism.platform.sdk.entity.booking.BookingStatus;
import ca.tourism.platform.sdk.entity.booking.BookingSummary;
import ca.tourism.platform.sdk.exceptions.HttpException;

import java.util.List;

/**
 * Created by ups on 9/05/19.
 */
public class BookingProvider {

    private RestClientProvider restClientProvider ;

    public BookingProvider(String secretToken) {
        this.restClientProvider = new RestClientProvider(secretToken) ;
    }

    public Booking createSimpleBooking(BookingSimple bookingSimple) throws HttpException {
        return restClientProvider.post("/api/v1/booking/bookings", Booking.class, bookingSimple);
    }

    public String deleteBooking(String id) throws HttpException {
        return restClientProvider.delete("/api/v1/booking/bookings/" + id, String.class);
    }

    public boolean updateBookingStatus(String id, BookingStatus status) throws HttpException {
        return restClientProvider.put("/api/v1/booking/bookings/"+id+"/newstatus/"+status + id, Boolean.class, null);
    }

    public List<Booking> getAllBookings() throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookings", List.class);
    }

    public List<BookingSummary> getAllBookings(String idUser) throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookings/history", List.class);
    }

    public Booking getBookingById(String id) throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookings/"+id, Booking.class);
    }

    public boolean verifyIfBookingExists(String id) throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookings/exists/"+id, Boolean.class);
    }

    public Booking updateBooking(Booking booking) throws HttpException {
        return restClientProvider.put("/api/v1/bookingProvider/bookings", Booking.class, booking);
    }

    public BookingSummary getBookingByUserIdAndBookingId(String bookingId, String userId) throws HttpException {
        return restClientProvider.get("/api/v1/booking/bookings/"+bookingId+"/"+userId, BookingSummary.class);
    }

}
