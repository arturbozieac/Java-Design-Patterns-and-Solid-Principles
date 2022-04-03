package behavioralPatterns.command;


public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();		
		Command c1 = new AddMemberCommand("c1@b.com", "spam", service);
		
		MailTasksRunner.getInstance().addCommand(c1);
		
		Command c2 = new AddMemberCommand("c2@b.com", "inbox", service);
		
		MailTasksRunner.getInstance().addCommand(c2);
	}

}
