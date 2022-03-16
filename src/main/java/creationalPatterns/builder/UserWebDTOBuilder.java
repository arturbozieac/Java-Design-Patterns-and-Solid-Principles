package creationalPatterns.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	UserWebDTO userDTO;
	
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date,  LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.toString();
		return this;
	}

	@Override
	public UserDTO build() {
	    userDTO = new UserWebDTO(firstName + " " + lastName, address, age);
		return userDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return userDTO;
	}
	
	
}
