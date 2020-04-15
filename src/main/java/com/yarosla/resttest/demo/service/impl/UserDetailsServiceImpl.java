package com.yarosla.resttest.demo.service.impl;

import com.yarosla.resttest.demo.model.User;
import com.yarosla.resttest.demo.model.UserRole;
import com.yarosla.resttest.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByName(s);
        user.orElseThrow(() -> new UsernameNotFoundException("User was not found"));

        User user1 = user.get();
        user1.setUserRoles(
                Arrays.asList(
                        new UserRole("USER")
                )
        );

        return new com.yarosla.resttest.demo.model.UserDetails(
                user.get().getUserRoles().stream().map(UserRole::getName).collect(Collectors.toList()),
                user.get().getPassword(),
                user.get().getName()
        );
    }
}
