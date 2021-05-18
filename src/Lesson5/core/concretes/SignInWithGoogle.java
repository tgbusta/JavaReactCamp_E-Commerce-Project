package Lesson5.core.concretes;

import Lesson5.core.abstracts.SignInWith;

public class SignInWithGoogle implements SignInWith {

	public String id = "googleSingInClientId";

	@Override
	public boolean onSuccess(String id, String userName, String password) {
		System.out.println("Google hesabý ile giriþ yapýldý.");
		return true;

	}
}