package com.example.spring_data_redis_cache_mysql.service;

import com.example.spring_data_redis_cache_mysql.entity.User;

public interface UserService {
    User save(User user);
    User getUserById(Long id);
    void deleteById(Long id);
}
