package behavioralPatterns.visitor;

import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		Employee organization = buildOrganization();
		PrintVisitor visitor = new PrintVisitor();
		
		visitOrganization(organization, visitor);
		
		
	}

	private static Employee buildOrganization() {
		
		Programmer p1 = new Programmer("Rachel","Java");
		Programmer p2 = new Programmer("Andy","Java");
		
		Programmer p3 = new Programmer("Josh","Java");
		Programmer p4 = new Programmer("Bill","Java");
		
		ProjectLead pl1 = new ProjectLead("Tina", p1, p2);
		ProjectLead pl2 = new ProjectLead("Joey", p3, p4);
		
		Manager m1 = new Manager("Chad", pl1);
		Manager m2 = new Manager("Chad II", pl2);
		
		VicePresident vp = new VicePresident("Richard", m1,m2);
		
		return vp;
	}
	
	public static void visitOrganization(Employee employee, Visitor visitor){
		employee.accept(visitor);
		if(!employee.getDirectReports().isEmpty()) {
			for (Iterator<Employee> iterator = employee.getDirectReports().iterator(); iterator.hasNext();) {
				visitOrganization(iterator.next(), visitor);
			}
		}
	}
	

}
