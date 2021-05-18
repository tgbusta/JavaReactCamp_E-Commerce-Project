package Lesson5.business.concretes;

import Lesson5.business.abstracts.VerificationService;
import Lesson5.dataAccess.abstracts.UserDao;
import Lesson5.entities.concretes.User;
public class EmailVerificationManager implements VerificationService{
	
	String generatedCode= "generatedCode";
	UserDao userDao; 
	
	@Override
	public void sendVerificationEmail(String email) {
		
		System.out.println("Doðrulama kodu: " + generatedCode +" "+ email +" adresine gönderildi.");
		
	}

	@Override
	public boolean isLinkClicked(String email, String code) {
		if(code==generatedCode) {
			System.out.println("E-posta adresi doðrulandý.");
			return true;
		}
		else {
			System.out.println("E-posta adresi doðrulanamadý.");
			return false;
		}
	}

	@Override
	public boolean inUseEmail(String email) {

		User foundUser = userDao.getByEmail(email);
		
		if(foundUser == null) {
			return false;
		} else {
			System.out.println("Bu e-posta adresi daha önce kullanýlmýþtýr.");
			return true;
		}
		
		
	}


}
