package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Mock user for demonstration purposes. Replace with real user lookup.
        if ("admin".equals(username)) {
            return org.springframework.security.core.userdetails.User
                    .withUsername("admin")
                    .password("{noop}admin123")
                    .roles("ADMIN")
                    .build();
        } else if ("student".equals(username)) {
            return org.springframework.security.core.userdetails.User
                    .withUsername("student")
                    .password("{noop}student123")
                    .roles("STUDENT")
                    .build();
        } else {
            throw new UsernameNotFoundException("User not found");
        }
    }
}
