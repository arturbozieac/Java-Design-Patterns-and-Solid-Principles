package behavioralPatterns.chainOfResponsability;

//A concrete handler
public class ProjectLead extends Employee{

	public ProjectLead(LeaveApprover succesor) {
		super("Project Lead", succesor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		// type is sick leave & duration is less than or equal to 2 days
		if(LeaveApplication.Type.Sick.equals(application.getType()) && application.getNoOfDays() <= 2) {
			application.approve(getApproverRole());
			
			return true;
		}
		return false;
	}

}
