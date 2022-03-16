package creationalPatterns.builder.secondImplementation;


import java.time.LocalDate;

import creationalPatterns.builder.Address;
import creationalPatterns.builder.User;
import creationalPatterns.builder.secondImplementation.UserDTO.UserDTOBuilder;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		UserDTO userDTO = directBuild(UserDTO.getBuilder(), createUser());
		System.out.println(userDTO);
	}
	
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		
		return builder.withFirstName(user.getFirstName())
					   .withLastName(user.getLastName())
					   .withBirthday(user.getBirthday())
					   .withAddress(user.getAddress())
					   .build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
