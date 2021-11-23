package com.vermaji.hangup.Service;

import com.vermaji.hangup.Repositories.UserCrudRepository;
import com.vermaji.hangup.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceDao{
    @Autowired
    private UserCrudRepository repository;

    @Override
    public User addUser(User reqUser) {
        User user = repository.save(reqUser);
        return user;
    }
}
