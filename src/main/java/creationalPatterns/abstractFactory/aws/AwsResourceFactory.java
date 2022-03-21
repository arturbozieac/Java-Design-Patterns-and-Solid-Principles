package creationalPatterns.abstractFactory.aws;

import creationalPatterns.abstractFactory.Instance;
import creationalPatterns.abstractFactory.Instance.Capacity;
import creationalPatterns.abstractFactory.ResourceFactory;
import creationalPatterns.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
