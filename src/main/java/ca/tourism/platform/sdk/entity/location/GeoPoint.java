package ca.tourism.platform.sdk.entity.location ;

/**
 * Created by ups on 29/04/19.
 */
public class GeoPoint {

    private double lat;
    private double lon;

    private GeoPoint() {}

    public GeoPoint(double latitude, double longitude) {
        this.lat = latitude;
        this.lon = longitude;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
