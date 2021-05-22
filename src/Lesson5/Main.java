package Lesson5;

import Lesson5.business.concretes.UserValidateManager;
import Lesson5.core.concretes.SignInWithGoogle;
import Lesson5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
			User user=new User(1, "Tuðba", "Usta", "tbozkurtusta@gmail.com", "tgbst", "123");
			UserValidateManager userValidateManager= new UserValidateManager();
			userValidateManager.passwordValidation(user.getPassword());
			userValidateManager.emailValidation(user.getEmail());
			SignInWithGoogle signInWithGoogle= new SignInWithGoogle();
			signInWithGoogle.onSuccess("googleSingInClientId", user.getUserName(), user.getPassword());
	}

}
