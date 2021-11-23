package com.vermaji.hangup.restService;

import com.vermaji.hangup.Service.StorageService;
import com.vermaji.hangup.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api-post")
public class UserPost {
    @GetMapping("/getAll")
    public ResponseEntity<List<Post>> getAllPost()
    {
        List<Post> list = new ArrayList<Post>();
        list.add(new Post("Somesh","A wonderful day","100","xyx.com","xyz.com"));
        list.add(new Post("Somesh","A wonderful day","100","xyx.com","xyz.com"));
        return new ResponseEntity<List<Post>>(list, HttpStatus.OK);
    }
    @PostMapping("/uploadPost")
    public String uploadPost(@RequestParam("file")MultipartFile file, RedirectAttributes attributes)
    {
        return "Upload successful";
    }
}
