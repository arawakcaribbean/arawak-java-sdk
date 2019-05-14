package ca.tourism.platform.sdk.entity.reviews;

import java.io.Serializable;
import java.util.Date;


public class Evaluation implements Serializable{  

	private String id;
	private String idResource;
	private String idApp;
	private String idUser;
	private Integer value;
	private Date date;		

	public Evaluation() {}

	public Evaluation(String id, String idResource, String idApp, String idUser, Integer value, Date date) {
		super();
		this.id = id;
		this.idResource = idResource;
		this.idApp = idApp;
		this.idUser = idUser;
		this.value = value;
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdResource() {
		return idResource;
	}

	public void setIdResource(String idResource) {
		this.idResource = idResource;
	}

	public String getIdApp() {
		return idApp;
	}

	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
