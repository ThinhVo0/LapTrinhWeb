package com.example.DAO;
import com.example.Model.UserModel;

import java.util.List;

public interface IUserDao {
    List<UserModel> findAll();
    UserModel findById(int id);
    void insert(UserModel user);
    UserModel findByUsername(String username);
    boolean checkExistEmail(String email);
    boolean checkExistUsername(String username);
    UserModel findByUsernameAndEmail(String username, String email);
    boolean updatePassword(String username, String password);
}
