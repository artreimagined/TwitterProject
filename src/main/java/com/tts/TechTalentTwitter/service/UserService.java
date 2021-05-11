package com.tts.TechTalentTwitter.service;

import java.util.List;

import com.tts.TechTalentTwitter.model.User;

public interface UserService  {

    User findByUsername(String username);
    List<User> findAll();
    void save(User user);
    void saveNewUser(User user);
    User getLoggedInUser();



}
