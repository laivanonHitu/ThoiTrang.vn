package com.Trangsuc.vn.Service;

import com.Trangsuc.vn.Entity.User;

public interface IAccountService {
	public int addAccount(User user);
	public boolean loginAccount(User user);
}
