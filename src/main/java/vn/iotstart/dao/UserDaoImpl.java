package vn.iotstart.dao;

import java.util.List;

import vn.iotstart.configs.DBConnectMySQL;
import vn.iotstart.models.UserModel;

public class UserDaoImpl extends DBConnectMySQL implements IUserDao{

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		String sql = "select *from users";
		
		
		
		return null;
	}

	@Override
	public UserModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(UserModel user) {
		// TODO Auto-generated method stub
		
	}

}
