package com.vermaji.hangup.restService;

import com.vermaji.hangup.Service.StorageService;
import com.vermaji.hangup.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserPostController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadFile(@RequestParam("file")MultipartFile file)
    {
        System.out.println(file.getOriginalFilename());
        if (file.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No file found");
        }else
        {
            storageService.store(file);
        }
        return ResponseEntity.ok("File uploaded");
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Post>> getAllPost()
    {
        System.out.println("hello");
        List<Post> list = new ArrayList<Post>();
        list.add(new Post("Somesh","A wonderful day","100","xyx.com","xyz.com"));
        list.add(new Post("Somesh","A wonderful day","100","xyx.com","xyz.com"));
        return new ResponseEntity<List<Post>>(list, HttpStatus.OK);
    }
}
