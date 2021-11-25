package com.vermaji.hangup.Service;

import com.vermaji.hangup.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

@Service
public class FileStorageService implements StorageService{
    @Autowired
    private UserPostService userPostService;

    private final Path path = Paths.get("uploads");
    @Override
    public void init() {
        try{
            if (!Files.isDirectory(path))
            {
                Files.createDirectory(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void store(MultipartFile file) {
        if (!file.isEmpty())
        {
            try{
                InputStream stream = file.getInputStream();
                Files.copy(stream,this.path.resolve(Objects.requireNonNull(file.getOriginalFilename())), StandardCopyOption.REPLACE_EXISTING);
                Post post = new Post();
                post.setUserName("Hello");
                post.setPostCaption("vermaji");
                userPostService.addNewPost(post);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
