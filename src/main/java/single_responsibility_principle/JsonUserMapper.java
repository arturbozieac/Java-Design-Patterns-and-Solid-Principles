package single_responsibility_principle;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUserMapper implements UserMapper{

	@Override
	public User mapUser(String requestContent) {
		ObjectMapper mapper = new ObjectMapper();
		User user = null;
		try {
			user = mapper.readValue(requestContent, User.class);
		} catch (Exception e) {
			// invalid data, bad practice to catch a generic exception
			// catch and hadle them all
			e.printStackTrace();
		} 
		return user;
	}
}
