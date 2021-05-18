package Lesson5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Lesson5.dataAccess.abstracts.UserDao;
import Lesson5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> userList= new ArrayList<User>();
	
	@Override
	public List<User> getAllUser() {
		return userList ;
	}

	@Override
	public User getByEmail(String email) {
		
		List<User> userList = getAllUser();
		
		for(User user : userList ) {
			if(email.equalsIgnoreCase(user.getEmail()))
				return user;
			
		}
		
	return null;
	}
	
	
	
	
	}


