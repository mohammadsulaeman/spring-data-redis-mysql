package com.example.spring_data_redis_cache_mysql.repository;

import com.example.spring_data_redis_cache_mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
