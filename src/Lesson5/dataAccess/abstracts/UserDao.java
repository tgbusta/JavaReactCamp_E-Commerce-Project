package Lesson5.dataAccess.abstracts;

import java.util.List;

import Lesson5.entities.concretes.User;

public interface UserDao {
	void add (User user);
	void update(User user);
	void delete(User user);
	List <User> getAllUser();
	
	User getByEmail(String email);

}
