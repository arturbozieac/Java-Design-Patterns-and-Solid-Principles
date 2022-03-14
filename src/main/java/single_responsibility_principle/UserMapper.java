package single_responsibility_principle;

public interface UserMapper {
	
	/**
	 * Maps a user
	 * 
	 * @param requestContent Request content as string.
	 * 
	 * @return The user.
	 */
	User mapUser(String requestContent);
}
