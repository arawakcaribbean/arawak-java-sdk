package ca.tourism.platform.sdk.entity.bookeable ;

import java.util.Date;

/**
 * Created by Jhon Quiufeng on 7/12/17.
 */


public class Bookable {

	private String id ;
    private String idapp;
    private String iduser;
    private String idrate;
    private String idresource;
    private String idlocation;
    private boolean isenabled = true;
    private Date datestart;
    private Date dateend;
    private Date createdAt;
    private Date updatedAt;

    public Bookable() {
    
    }

	public Bookable(String id, String idapp, String iduser, String idrate, String idresource, String idlocation, boolean isenabled, Date datestart,	Date dateend, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.idapp = idapp;
		this.iduser = iduser;
		this.idrate = idrate;
		this.idresource = idresource;
		this.idlocation = idlocation;
		this.isenabled = isenabled;
		this.datestart = datestart;
		this.dateend = dateend;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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

	public String getIdrate() {
		return idrate;
	}

	public void setIdrate(String idrate) {
		this.idrate = idrate;
	}

	public String getIdresource() {
		return idresource;
	}

	public void setIdresource(String idresource) {
		this.idresource = idresource;
	}

	public String getIdlocation() {
		return idlocation;
	}

	public void setIdlocation(String idlocation) {
		this.idlocation = idlocation;
	}

	public boolean isIsenabled() {
		return isenabled;
	}

	public void setIsenabled(boolean isenabled) {
		this.isenabled = isenabled;
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
  
}
