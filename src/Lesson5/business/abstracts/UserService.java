package Lesson5.business.abstracts;

import Lesson5.entities.concretes.User;

public interface UserService {
	void register (User user);
	void login (User user);
	void logout (User user);
	void delete (User user);
	void registerWith (User user);
}
