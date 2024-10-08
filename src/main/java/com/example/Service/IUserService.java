package com.example.Service;

import com.example.Model.UserModel;

public interface IUserService {
    UserModel login(String username, String password);
    UserModel findByUsername(String username);
    UserModel findByUsernameAndEmail(String username, String email);
    boolean updatePassword(String username,String newPassword);
    boolean checkExistEmail(String email);
    boolean checkExistUsername(String username);

    boolean register(String username, String email, String password, int i);
}
