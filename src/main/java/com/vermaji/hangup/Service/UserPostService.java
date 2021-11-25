package com.vermaji.hangup.Service;

import com.vermaji.hangup.Repositories.UserPostCrudRepo;
import com.vermaji.hangup.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPostService implements UserPostDao{
    @Autowired
    private UserPostCrudRepo userPostCrudRepo;

    public Post addNewPost(Post post)
    {
        return userPostCrudRepo.save(post);
    }
}
