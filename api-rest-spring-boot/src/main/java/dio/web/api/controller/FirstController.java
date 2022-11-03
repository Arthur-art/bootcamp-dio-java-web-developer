package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FirstController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello World - Controller";
    }

    @PostMapping("/create-user")
    public String createUser(@RequestBody User user){
        User newUser = new User();
        newUser.setLogin(user.getLogin());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);

        return "Usuario Cadastrado!";
    }

    @GetMapping("/get-users")
    public List<User> getUsers(){
        List<User> users = userRepository.findAll();
        return users;
    }

    @PutMapping("/update-user")
    public String updateUser(@RequestBody User user){
        System.out.println(user);
        User newUser = new User();
        newUser.setId(user.getId());
        newUser.setLogin(user.getLogin());
        newUser.setPassword(user.getPassword());
        userRepository.save(newUser);

        return "Usuario Atualizado!";
    }
    @DeleteMapping("delete-user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userRepository.deleteById(id);

        return"User delete";
    }
}
