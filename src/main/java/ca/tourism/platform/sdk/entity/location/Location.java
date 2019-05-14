package ca.tourism.platform.sdk.entity.location ;

import ca.tourism.platform.sdk.entity.country.Country;

import java.util.List;

public class Location {

    private String id;
    
    private String appId;
	private String name;
    private String resourceId;
    private GeoPoint location;
    private String street;
    private String city;
    private String state;
    private String community;
    private String region;
    private Country country;
    private List<String> timeZone ;
    private List<String> phoneNumbers;
    private String fax;
    private String email;
    private String tpdco;

	public Location() {}

	public Location(String appId, String name, String resourceId, GeoPoint location, String street, String city, String state, String community, String region, Country country, List<String> timeZone, List<String> phoneNumbers, String fax, String email, String tpdco) {
		this.appId = appId;
		this.name = name;
		this.resourceId = resourceId;
		this.location = location;
		this.street = street;
		this.city = city;
		this.state = state;
		this.community = community;
		this.region = region;
		this.country = country;
		this.timeZone = timeZone;
		this.phoneNumbers = phoneNumbers;
		this.fax = fax;
		this.email = email;
		this.tpdco = tpdco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public GeoPoint getLocation() {
		return location;
	}

	public void setLocation(GeoPoint location) {
		this.location = location;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<String> getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(List<String> timeZone) {
		this.timeZone = timeZone;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTpdco() {
		return tpdco;
	}

	public void setTpdco(String tpdco) {
		this.tpdco = tpdco;
	}
}
