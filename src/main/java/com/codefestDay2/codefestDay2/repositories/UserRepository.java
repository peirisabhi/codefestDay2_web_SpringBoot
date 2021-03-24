package com.codefestDay2.codefestDay2.repositories;

import com.codefestDay2.codefestDay2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
