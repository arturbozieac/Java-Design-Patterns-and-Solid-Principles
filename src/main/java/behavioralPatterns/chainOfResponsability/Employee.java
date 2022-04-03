package behavioralPatterns.chainOfResponsability;

//Abstract handler
public abstract class Employee implements LeaveApprover{
	
	private String role;
	private LeaveApprover successor;
	
	public Employee(String role, LeaveApprover succesor) {
		this.role = role;
		this.successor = succesor;
	}
	
	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if(!processRequest(application) && successor != null) {
			successor.processLeaveApplication(application);
		}
	}

	protected abstract boolean processRequest(LeaveApplication application);

	@Override
	public String getApproverRole() {
		return role;
	}
	
	
	
}