package ca.tourism.platform.sdk.entity.booking ;

import ca.tourism.platform.sdk.entity.bookeable.Bookable;
import java.util.Date;

/**
 * Created by Jhon Quiufeng on 7/12/17.
 */

public class Booking {

	private String id ;
    private String idapp;
    private String iduser;
    private String idresource;
    private BookingStatus status;
    private Date datestart;
    private Date dateend;
    private Date createdAt;
    private Date updatedAt;
    private Bookable bookable ;

    public Booking() {}

	public Booking(String idapp,String iduser, String idresource, BookingStatus status, Date datestart, Date dateend, Bookable bookable) {
		super();
		this.idapp = idapp;
		this.iduser = iduser;
		this.idresource = idresource;
		this.status = status;
		this.datestart = datestart;
		this.dateend = dateend;
		this.bookable = bookable;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdapp() {
		return idapp;
	}

	public void setIdapp(String idapp) {
		this.idapp = idapp;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getIdresource() {
		return idresource;
	}

	public void setIdresource(String idresource) {
		this.idresource = idresource;
	}

	public BookingStatus getStatus() {
		return status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}

	public Date getDatestart() {
		return datestart;
	}

	public void setDatestart(Date datestart) {
		this.datestart = datestart;
	}

	public Date getDateend() {
		return dateend;
	}

	public void setDateend(Date dateend) {
		this.dateend = dateend;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Bookable getBookable() {
		return bookable;
	}

	public void setBookable(Bookable bookable) {
		this.bookable = bookable;
	}

}
