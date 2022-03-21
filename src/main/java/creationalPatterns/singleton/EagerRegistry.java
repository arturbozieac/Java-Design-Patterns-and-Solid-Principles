package creationalPatterns.singleton;

/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
	
	private EagerRegistry() {};
	
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	
	public EagerRegistry getInstance() {
		return INSTANCE;
	}
}