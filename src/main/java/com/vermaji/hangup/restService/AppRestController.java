package com.vermaji.hangup.restService;
import com.vermaji.hangup.Service.UserServiceDao;
import com.vermaji.hangup.models.Greeting;
import com.vermaji.hangup.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppRestController {
    @Autowired
    private UserServiceDao userServiceDao;

    @GetMapping("/")
    public String home()
    {
        return "Hello hang up user";
    }

    @GetMapping("/addUser")
    public User addUser()
    {
        System.out.println("Hello");
        User user = userServiceDao.addUser(new User("somesh","password"));
        return null;
    }
    @GetMapping("/greeting")
    public ResponseEntity<Greeting> greeting()
    {
        System.out.println("Hello");
        return new ResponseEntity<Greeting>(new Greeting("Somesh","12345"), HttpStatus.OK) ;
    }
}
