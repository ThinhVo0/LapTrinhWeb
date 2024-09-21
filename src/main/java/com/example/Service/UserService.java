package com.example.Service;

import com.example.DAO.IUserDao;
import com.example.DAO.UserDaoImpl;
import com.example.Model.UserModel;
import com.example.Service.IUserService;

public class UserService implements IUserService {
    //    lay all ham trong tang Dao of user
    IUserDao userDao=new UserDaoImpl();
    @Override
    public UserModel login(String username, String password) {
        UserModel user = userDao.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public UserModel findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public UserModel findByUsernameAndEmail(String username, String email) {
        return userDao.findByUsernameAndEmail(username, email);
    }

    @Override
    public boolean updatePassword(String username, String newPassword) {
        return userDao.updatePassword(username, newPassword);
    }
    @Override
    public boolean register(String username, String email,String
            password,int  roleid) {
        if (userDao.checkExistUsername(username)) {
            return false;
        }
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        userDao.insert(new UserModel(username,email,password,roleid));
        return true;
    }
    @Override
    public boolean checkExistEmail(String email) {
        return userDao.checkExistEmail(email);
    }
    @Override
    public boolean checkExistUsername(String username) {
        return userDao.checkExistUsername(username);
    }

}