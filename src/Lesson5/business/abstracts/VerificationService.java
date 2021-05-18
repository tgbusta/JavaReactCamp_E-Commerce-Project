package Lesson5.business.abstracts;


public interface VerificationService {
	void sendVerificationEmail(String email);
	boolean isLinkClicked(String email, String code);
	boolean inUseEmail(String email);
}
