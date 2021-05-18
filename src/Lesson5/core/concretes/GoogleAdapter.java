package Lesson5.core.concretes;

import Lesson5.core.abstracts.SignInWith;

public class GoogleAdapter implements SignInWith{

	public String id = "googleSingInClientId";
	
	@Override
	public boolean onSuccess(String clientId, String userName, String password) {
		
			
		SignInWithGoogle googleManager = new SignInWithGoogle();
		googleManager.onSuccess(clientId, userName, password);
		return true;
	}

}
