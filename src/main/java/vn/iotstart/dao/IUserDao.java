package vn.iotstart.dao;

import java.util.List;

import vn.iotstart.models.UserModel;

public interface IUserDao {
	List<UserModel> findAll();
	
	UserModel findById(int id);
	
	void insert(UserModel user);
	
	
	

}
