package com.vermaji.hangup.Repositories;


import com.vermaji.hangup.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCrudRepository extends JpaRepository<User, Integer> {

}
