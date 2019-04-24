package no.hvl.fri.dataaccess;

public class FireRiskResponse {

	private boolean success;
	
	private FireRiskIndication indication;

	public FireRiskResponse(boolean success, FireRiskIndication indication) {
		super();
		this.success = success;
		this.indication = indication;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public FireRiskIndication getIndication() {
		return indication;
	}

	public void setIndication(FireRiskIndication indication) {
		this.indication = indication;
	}
	
	
}
