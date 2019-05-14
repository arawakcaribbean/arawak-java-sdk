package ca.tourism.platform.sdk.entity.reviews;


import java.util.Date;

public class State{

	private String id;
	private String idResource;
	private String idApp;
	private String idUser;
	private StateEnum value;
	private Date date;
			

	public State() {}


	public State(String id, String idResource, String idApp, String idUser, StateEnum value, Date date) {
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


	public StateEnum getValue() {
		return value;
	}


	public void setValue(StateEnum value) {
		this.value = value;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
		
 
}
