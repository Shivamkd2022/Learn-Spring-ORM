package com.springORM.Services;

import com.springORM.Entities.User;
import com.springORM.Repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
    Logger logger= LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user)
    {
        User save = userRepository.save(user);
        logger.info("User saved {}",save.getId());
        return save;
    }

    @Override
    public User updateUser(User user, int userId)
    {
//        step1: first we get the data from the db.

        User olduser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user with given id is not found"));

        olduser.setName(user.getName());
        olduser.setAge(user.getAge());
        olduser.setCity(user.getCity());

//        step 2: then update the user details.

        User saved = userRepository.save(olduser);
        return saved;
    }

    @Override
    public void deleteUser(int userid)
    {
//        User user5 = userRepository.findById(userid).orElseThrow(() -> new RuntimeException("user not found exception"));
//       userRepository.delete(user5);
        userRepository.deleteById(userid);
        logger.info("user deleted");

    }

    @Override
    public List<User> getAllUser()
    {
        List<User> all = userRepository.findAll();
        logger.info("the list of users are: {}", all);
        return all;
    }

    @Override
    public User getSingleUser(int userid)
    {
        Optional<User> byId = userRepository.findById(userid);
        logger.info("the details of user is :{}",byId);
        User orElseThrow = byId.orElseThrow(() -> new RuntimeException("User details with given id are not found."));
        return orElseThrow;
    }
}
