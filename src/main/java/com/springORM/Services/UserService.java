package com.springORM.Services;

import com.springORM.Entities.User;

import java.util.List;

public interface UserService
{
    User saveUser(User uUser);
    User updateUser(User user, int userId);
    void deleteUser(int userid);
    List<User> getAllUser();
    User getSingleUser (int userid );
}
