package ca.tourism.platform.sdk.entity.claim ;


import java.util.Date;

public class Claim {

	private String id ;
	private String idApp;
	private String idResource;
	private String idCurrentOwner;
	private String idUserClaimer;
	private Date claimedAt = new Date();
	private ClaimStatus claimStatus = ClaimStatus.CLAIMED;

	public Claim() {}

	public Claim(String id, String idApp, String idResource, String idCurrentOwner, String idUserClaimer, Date claimedAt, ClaimStatus claimStatus) {
		super();
		this.id = id;
		this.idApp = idApp;
		this.idResource = idResource;
		this.idCurrentOwner = idCurrentOwner;
		this.idUserClaimer = idUserClaimer;
		this.claimedAt = claimedAt;
		this.claimStatus = claimStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdApp() {
		return idApp;
	}

	public void setIdApp(String idApp) {
		this.idApp = idApp;
	}

	public String getIdResource() {
		return idResource;
	}

	public void setIdResource(String idResource) {
		this.idResource = idResource;
	}

	public String getIdCurrentOwner() {
		return idCurrentOwner;
	}

	public void setIdCurrentOwner(String idCurrentOwner) {
		this.idCurrentOwner = idCurrentOwner;
	}

	public String getIdUserClaimer() {
		return idUserClaimer;
	}

	public void setIdUserClaimer(String idUserClaimer) {
		this.idUserClaimer = idUserClaimer;
	}

	public Date getClaimedAt() {
		return claimedAt;
	}

	public void setClaimedAt(Date claimedAt) {
		this.claimedAt = claimedAt;
	}

	public ClaimStatus getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(ClaimStatus claimStatus) {
		this.claimStatus = claimStatus;
	}

}
