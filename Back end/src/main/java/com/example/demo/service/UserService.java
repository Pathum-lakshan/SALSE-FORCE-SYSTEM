package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * ALE IS TER
 * 10/16/2022
 * 9:45 AM
 * Spring-Boot-Demo-Test
 * com.example.demo.service
 * UserService
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public UserDTO updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public UserDTO deleteUser(UserDTO userDTO) {
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser() {
        List<User> all = userRepo.findAll();

        return modelMapper.map(all, new TypeToken<List<UserDTO>>() {
        }.getType());
    }
    public UserDTO getUserById(String id){
        return modelMapper.map(userRepo.getUserByUserID(id),UserDTO.class);
    }
    public UserDTO getUserByIdAndAddress(String id , String address){
        return modelMapper.map(userRepo.getUserByUserIdAndAddress(id,address),UserDTO.class);
    }
    public int updateUserNameById(String name , String id){
        return userRepo.updateUserNameById(name,id);
    }

}
