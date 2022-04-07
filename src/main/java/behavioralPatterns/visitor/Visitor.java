package behavioralPatterns.visitor;

public interface Visitor {
	
	void visit(VicePresident vicePresident);
	void visit(Manager manager);
	void visit(ProjectLead projectLead);
	void visit(Programmer programmer);
}
