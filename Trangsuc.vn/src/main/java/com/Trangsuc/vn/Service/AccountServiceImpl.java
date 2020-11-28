package com.Trangsuc.vn.Service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.UserDAO;
import com.Trangsuc.vn.Entity.User;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private UserDAO userDAO;

	public int addAccount(User user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return this.userDAO.addAccount(user);
	}

	@SuppressWarnings("unused")
	@Override
	public boolean loginAccount(User user) {
		user = (User) userDAO.loginAccount(user);
		String pass = user.getPassword();
		if (user != null) {
			if(BCrypt.checkpw(pass, user.getPassword())) {
				return true;
			}else {
				return false;
			}
		}
		
		return false;
	}

}
