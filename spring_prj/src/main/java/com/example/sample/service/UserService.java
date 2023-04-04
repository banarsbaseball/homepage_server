package com.example.sample.service;

import com.example.sample.dto.UserUpdateRequest;
import com.example.sample.entity.UserEntity;
import com.example.sample.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserUpdateRequest userUpdateRequest;

    public List<UserEntity> getAccount() {
        return userRepository.findAll();
    }

    public void userUpdate(UserUpdateRequest userUpdateRequest){
        userRepository.save(userUpdateRequest);
    }
        
}
