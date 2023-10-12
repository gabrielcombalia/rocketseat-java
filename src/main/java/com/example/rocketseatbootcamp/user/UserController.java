package com.example.rocketseatbootcamp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
*/


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;


    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros 0.0000
     * Float (float) numeros 0.000
     * char (A C )
     * Date (data)
     */

    /**
     *
     * body da requisição
     */

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());
        var userCreated = this.userRepository.save(userModel);
        return userCreated;
    }
}
