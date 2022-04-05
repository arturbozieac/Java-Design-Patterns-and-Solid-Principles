package behavioralPatterns.interpreter;


public class Client {

	public static void main(String[] args) {
		Report report = new Report("My report", "NOT ADMIN OR USER AND FINANCE_ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();
		
		PermissionExpression exp = builder.build(report);
		System.out.println(exp);
		
		User user = new User("Gary", "FINANCE_ADMIN");
		System.out.println(exp.interpret(user));
	}

}
