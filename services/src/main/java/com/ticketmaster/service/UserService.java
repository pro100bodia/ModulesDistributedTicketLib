package com.ticketmaster.service;

import com.ticketmaster.exceptions.NotFoundException;
import com.ticketmaster.persistence.model_repository.UserModelRepository;
import com.ticketmaster.service.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserModelRepository userRepo;

    UserService(UserModelRepository userRepo) {
        this.userRepo = userRepo;
    }

    public List<UserModel> findAll() {
        List<UserModel> userModels = userRepo.findAll();

        if (userModels == null) {
            throw new NotFoundException("Database has no users");
        }

        return userModels;
    }

    public UserModel getUserByUsername(String username) {
        UserModel result = userRepo.findByUsername(username);

        if (result == null) {
            throw new NotFoundException("User not found");
        }

        return result;
    }

    public void saveUser(UserModel userModel) {
        //TODO: implement 406 Not Acceptable exception throw

        userRepo.saveUser(userModel);
    }


    public void deleteUser(String username) {
        userRepo.deleteUser(username);
    }
}