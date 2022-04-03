package behavioralPatterns.chainOfResponsability;

import java.time.LocalDate;

import behavioralPatterns.chainOfResponsability.LeaveApplication.Type;

public class Client {

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);

		return lead;
	}

	public static void main(String[] args) {
		LeaveApplication application = LeaveApplication.getBuilder().withType(Type.PTO)
																	.from(LocalDate.now())
																	.to(LocalDate.of(2022, 4, 15))
																	.build();
		
		LeaveApprover approver = createChain();
		approver.processLeaveApplication(application);
		
		System.out.println(application);
	}

}
