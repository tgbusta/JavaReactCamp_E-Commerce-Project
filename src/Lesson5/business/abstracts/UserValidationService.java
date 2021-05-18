package Lesson5.business.abstracts;

public interface UserValidationService {

	boolean passwordValidation(String password);
	boolean nameValidation(String firstName, String lastName);
	boolean emailValidation(String email);
	
}
