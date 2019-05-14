package ca.tourism.platform.sdk.entity.country ;

import java.util.List;


public class Country {

	private String id;
	private String name;
	private String code;
	private String capital;
	private List<String> timezones;
	private double latitude;
	private double longitude;

	public Country() {}

	public Country(String name, String code, String capital, List<String> timezones, double latitude, double longitude) {
		this.name = name;
		this.code = code;
		this.capital = capital;
		this.timezones = timezones;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<String> getTimezones() {
		return timezones;
	}

	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Country{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", code='" + code + '\'' +
				", capital='" + capital + '\'' +
				", timezones=" + timezones +
				", latitude=" + latitude +
				", longitude=" + longitude +
				'}';
	}
}
