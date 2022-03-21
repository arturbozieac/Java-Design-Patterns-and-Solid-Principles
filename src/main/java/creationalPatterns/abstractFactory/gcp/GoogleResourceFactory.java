package creationalPatterns.abstractFactory.gcp;

import creationalPatterns.abstractFactory.Instance;
import creationalPatterns.abstractFactory.Instance.Capacity;
import creationalPatterns.abstractFactory.ResourceFactory;
import creationalPatterns.abstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}


}
