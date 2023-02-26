package com.example.sample.service;

import com.example.sample.entity.UserEntity;
import com.example.sample.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserEntity> getAccount() {
        return userRepository.findAll();
    }
}
