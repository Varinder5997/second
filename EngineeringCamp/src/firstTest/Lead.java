package firstTest;

public class Lead {
	protected int a=1;
	private int leadId;
	private String name;
	private String [] campusMindName;
	
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getCampusMindName() {
		return campusMindName;
	}
	public void setCampusMindName(String[] campusMindName) {
		this.campusMindName = campusMindName;
	}

}
