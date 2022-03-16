package creationalPatterns.builder.secondImplementation;

import java.time.LocalDate;
import java.time.Period;

import creationalPatterns.builder.Address;

public class UserDTO {
	
	private String name;
	private String address;
	private String age;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	private void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	private void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	/**
	 * Get builder instance
	 * 
	 * @return The builder instance.
	 */
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}
	
	public static class UserDTOBuilder {

		private String firstName;
		private String lastName;
		private String age;
		private String address;
		UserDTO userDTO;
		
		// Do not allow to create builder outside the class. Optional
		private UserDTOBuilder() {};
		
		public UserDTOBuilder withFirstName(String fname) {
			firstName = fname;
			return this;
		}

		public UserDTOBuilder withLastName(String lname) {
			lastName = lname;
			return this;
		}

		public UserDTOBuilder withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date,  LocalDate.now());
			age = Integer.toString(ageInYears.getYears());
			return this;
		}

		public UserDTOBuilder withAddress(Address address) {
			this.address = address.toString();
			return this;
		}

		public UserDTO build() {
		    userDTO = new UserDTO();
		    userDTO.setName(firstName + " " + lastName);
		    userDTO.setAge(age);
		    userDTO.setAddress(address);
			return this.userDTO;
		}

		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
