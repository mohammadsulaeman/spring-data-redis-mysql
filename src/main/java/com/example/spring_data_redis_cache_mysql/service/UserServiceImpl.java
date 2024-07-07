package com.example.spring_data_redis_cache_mysql.service;

import com.example.spring_data_redis_cache_mysql.entity.User;
import com.example.spring_data_redis_cache_mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @CachePut(value = "users",key = "#user.id")
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @Cacheable(value = "users",key = "#id")
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    @CacheEvict(value = "users",key = "#id")
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
