package com.vermaji.hangup.Repositories;

import com.vermaji.hangup.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPostCrudRepo extends JpaRepository<Post,Long> {
}
