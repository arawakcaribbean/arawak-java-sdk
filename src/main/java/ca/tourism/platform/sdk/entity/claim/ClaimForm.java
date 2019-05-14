package ca.tourism.platform.sdk.entity.claim ;


import java.util.Date;

public class ClaimForm {

	private String id;
	private String idClaimer;
	private String idUserClaimer;
	private String fullNameClaimer;
	private String addressClaimer;
	private String emailClaimer;
	private String phoneClaimer;
	private String reason;
	private String imageEvidence;
	private Date claimedAt;

	public ClaimForm() {}

	public ClaimForm(String id, String idClaimer, String idUserClaimer, String fullNameClaimer, String addressClaimer, String emailClaimer, String phoneClaimer, String reason, String imageEvidence, Date claimedAt) {
		super();
		this.id = id;
		this.idClaimer = idClaimer;
		this.idUserClaimer = idUserClaimer;
		this.fullNameClaimer = fullNameClaimer;
		this.addressClaimer = addressClaimer;
		this.emailClaimer = emailClaimer;
		this.phoneClaimer = phoneClaimer;
		this.reason = reason;
		this.imageEvidence = imageEvidence;
		this.claimedAt = claimedAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdClaimer() {
		return idClaimer;
	}

	public void setIdClaimer(String idClaimer) {
		this.idClaimer = idClaimer;
	}

	public String getIdUserClaimer() {
		return idUserClaimer;
	}

	public void setIdUserClaimer(String idUserClaimer) {
		this.idUserClaimer = idUserClaimer;
	}

	public String getFullNameClaimer() {
		return fullNameClaimer;
	}

	public void setFullNameClaimer(String fullNameClaimer) {
		this.fullNameClaimer = fullNameClaimer;
	}

	public String getAddressClaimer() {
		return addressClaimer;
	}

	public void setAddressClaimer(String addressClaimer) {
		this.addressClaimer = addressClaimer;
	}

	public String getEmailClaimer() {
		return emailClaimer;
	}

	public void setEmailClaimer(String emailClaimer) {
		this.emailClaimer = emailClaimer;
	}

	public String getPhoneClaimer() {
		return phoneClaimer;
	}

	public void setPhoneClaimer(String phoneClaimer) {
		this.phoneClaimer = phoneClaimer;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getImageEvidence() {
		return imageEvidence;
	}

	public void setImageEvidence(String imageEvidence) {
		this.imageEvidence = imageEvidence;
	}

	public Date getClaimedAt() {
		return claimedAt;
	}

	public void setClaimedAt(Date claimedAt) {
		this.claimedAt = claimedAt;
	}

}
