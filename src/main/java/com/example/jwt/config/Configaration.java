package com.example.jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class Configaration {

    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder(); // Password Encoder Using BcryptPassword
    }

    @Bean
    public UserDetailsService userDetailsService() {
        /*
        * This is for the Admin User Configuration
        */
        UserDetails adminUser = User.builder()
                .username("Admin")
                .password("Admin")
                .roles("ADMIN").build();

        /*
         * This is for Normal User Configuration
         */
        UserDetails user = User.builder()
                .username("User")
                .password("User")
                .roles("USER").build();

        return new InMemoryUserDetailsManager(adminUser, user); // This is for the Save In memory
                                                                // user Save..
    }

    /*
     * This is for Authentication Manager Configuration Class
     * For User Authentication.
     */
    @Bean
    public AuthenticationManager authenticationManager
            (AuthenticationConfiguration configuration) throws Exception {

        return configuration.getAuthenticationManager();
    }

}
