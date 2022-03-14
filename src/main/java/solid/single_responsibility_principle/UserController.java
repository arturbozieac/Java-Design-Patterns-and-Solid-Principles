package solid.single_responsibility_principle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//Handles incoming JSON requests that work on User
public class UserController {

	// If we need to another storing method for user, we simply add another service
    private UserPersistenceService persistenceService = new UserPersistenceService();
    
    //Create a new user
    public String createUser(String requestContent) {
    	
    	User user = null;
    	if(isJSONValid(requestContent)) {
    		// Map a user from a json request
    		JsonUserMapper mapper = new JsonUserMapper();
    		user = mapper.mapUser(requestContent);
    	}else if(isXMLValid(requestContent)) {
    		// Map a user from a xml request
    		XmlUserMapper mapper = new XmlUserMapper();
    		user = mapper.mapUser(requestContent);
    	}

        UserValidator validator = new UserValidator();
        boolean valid = validator.validateUser(user);
        
        if(!valid) {
            return "ERROR";
        }

        persistenceService.saveUser(user);
        
        return "SUCCESS";
    } 
    
    private boolean isXMLValid(String requestContent) {
		// Check for xml valid ...
    	return false;
	}

	public boolean isJSONValid(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }

}