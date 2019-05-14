package ca.tourism.platform.sdk.entity.booking ;
import java.util.Date;


/**
 * Created by Jhon Quiufeng on 10/12/17.
 */
public class BookingSimple {

    private String idapp;
    private String iduser;
    private String idresource;
    private BookingStatus status;
    private Date datestart;
    private Date dateend;
    private String bookableId ;

    public BookingSimple() {
    }

	public BookingSimple(String idapp, String iduser, String idresource, BookingStatus status, Date datestart,
						 Date dateend, String bookableId) {
		super();
		this.idapp = idapp;
		this.iduser = iduser;
		this.idresource = idresource;
		this.status = status;
		this.datestart = datestart;
		this.dateend = dateend;
		this.bookableId = bookableId;
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

	public String getBookableId() {
		return bookableId;
	}

	public void setBookableId(String bookableId) {
		this.bookableId = bookableId;
	}
   
}
