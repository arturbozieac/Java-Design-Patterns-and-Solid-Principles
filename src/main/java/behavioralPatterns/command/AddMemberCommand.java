package behavioralPatterns.command;


//A Concrete implementation of Command.
public class AddMemberCommand implements Command{

	private String emailAdress;
	private String listName;
	private EWSService receiver;
	
	public AddMemberCommand(String email, String listName, EWSService service) {
		this.emailAdress = email;
		this.listName = listName;
		this.receiver = service;
	}
	
	@Override
	public void execute() {
		receiver.addMember(emailAdress, listName);
	}
		

}
