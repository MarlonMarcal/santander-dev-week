package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long id) throws NoSuchFieldException;

    User create(User userToCreate);

}
