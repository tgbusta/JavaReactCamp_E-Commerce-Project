package Lesson5.business.concretes;

import Lesson5.business.abstracts.UserService;
import Lesson5.entities.concretes.User;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
System.out.println("Kullan�c� kayd� olu�turuldu: "+user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerWith(User user) {
		// TODO Auto-generated method stub
		
	}

	
}
