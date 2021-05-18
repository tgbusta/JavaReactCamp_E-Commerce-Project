package Lesson5.business.concretes;

import Lesson5.business.abstracts.UserValidationService;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class UserValidateManager implements UserValidationService {

	@Override
	public boolean passwordValidation(String password) {
		if (password.length() < 6) {
			System.out.println("Parolan�z en az 6 karakterden olu�mal�d�r.");
			return false;
		}
		
		{
			System.out.println("Parolan�z kabul edilldi.");
			return true;
		}
		
		
	}

	@Override
	public boolean nameValidation(String firstName, String lastName) {

		if (firstName.length()>=2 && lastName.length()>=2) {
			return true;
		}
		
		{
			System.out.println("Ad�n�z ve soyad�n�z en az 2 harften olu�mal�d�r.");
			return false;
		}
	
	}

	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	//TODO: bir arrayList e ekleyip yeni gelen o list i�inde var m� diye bakmam gerek
	public boolean emailValidation(String email) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        else {
            System.out.println("Ge�ersiz bir e-posta adresi girdiniz.");
            return false;
        }
	}

}
