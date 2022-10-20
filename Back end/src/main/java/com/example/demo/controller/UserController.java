package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
        return userService.getAllUser();
    }
    @PostMapping("/saveUser")
    public @ResponseBody UserDTO saveUser(@RequestBody UserDTO userDTO){
       return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public UserDTO deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }
    @GetMapping("/getUserById/{id}")
    public UserDTO getUserById (@PathVariable String id){
        return userService.getUserById(id);
    }
    @GetMapping("/getUserByIdAndAddress/{id}/{address}")
    public UserDTO getUserByIdAndAddress(@PathVariable String id, @PathVariable String address){
        return userService.getUserByIdAndAddress(id,address);
    }
    @PutMapping("/updateUserById/{name}/{id}")
    public int updateUserById(@PathVariable String name, @PathVariable String id){
        return userService.updateUserNameById(name,id);
    }
    @GetMapping("/testRequestParams")
    public void testRequestParams (@RequestParam(value = "test", required = false) String test){
        System.out.println(test);
    }
}
