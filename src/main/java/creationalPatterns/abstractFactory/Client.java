package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.Instance.Capacity;
import creationalPatterns.abstractFactory.aws.AwsResourceFactory;
import creationalPatterns.abstractFactory.gcp.GoogleResourceFactory;

public class Client {

	private ResourceFactory factory;
	
    public static void main(String[] args) {
    	Client aws = new Client(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.large, 4096);
    	i1.start();
    	i1.stop();
    	
    	Client gcp = new Client(new GoogleResourceFactory());
    	Instance i2 = gcp.createServer(Capacity.large, 4096);
    	i2.start();
    	i2.stop();
    }
    
    public Client(ResourceFactory factory) {
    	this.factory = factory;
    }
    
    public Instance createServer(Instance.Capacity cap, int storageMib) {
    	Instance instance = factory.createInstance(cap);
    	Storage storage = factory.createStorage(storageMib);
    	instance.attachStorage(storage);
    	
    	return instance;
    }

}
