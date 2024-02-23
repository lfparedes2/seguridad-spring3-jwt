/*
package com.ec.springsecurity.utils;

import com.ec.springsecurity.model.Authority;
import com.ec.springsecurity.model.User;
import com.ec.springsecurity.repositories.AuthorityRepository;
import com.ec.springsecurity.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;

    public Runner(UserRepository userRepository, AuthorityRepository authorityRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (this.authorityRepository.count() == 0){
            this.authorityRepository.saveAll(List.of(
                    new Authority(AuthorityName.ADMIN),
                    new Authority(AuthorityName.READ),
                    new Authority(AuthorityName.WRITE)
            ));
        }

        if (this.userRepository.count() == 0){
            this.userRepository.saveAll(List.of(
                    new User("usuario","123",List.of(this.authorityRepository.findByName(AuthorityName.ADMIN).get())
            );
                   new User("usuario2","123", List.of(this.authorityRepository.findByName(AuthorityName.READ).get())),
                    new User("usuario3","123", List.of(this.authorityRepository.findByName(AuthorityName.WRITE).get()));

        }
    }
}
*/
