package behavioralPatterns.nullObject;

public class Client {

	public static void main(String[] args) {
		ComplexService service = new ComplexService("Simple report",new StorageService());
		service.generateReport();
		service = new ComplexService("Simple report", new NullStorageService());
		service.generateReport();
		
	}

}
