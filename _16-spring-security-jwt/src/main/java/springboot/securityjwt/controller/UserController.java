package springboot.securityjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.securityjwt.model.User;
import springboot.securityjwt.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/")
    public String welcome(){
        return "Hello springboot.securityjwt";
    }
    @GetMapping("/users")
    public List<User> users() {

        return userRepository.findAll();
    }
    @GetMapping("/managers")
    public String managers() {
        return "Authorized manager";
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.getRoles().add(userRequest.getRoles().get(0));
        userRepository.save(user);
        return user;
    }
}
