package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig  {
public UserDetailsService userDetailsService(){
var userDetailsService = new InMemoryUserDetailsManager();
// Creando el primer usuario con nombre bilal
    UserDetails user1 = User.builder()
            .username("bilal")
            .password(this.passwordEncoder().encode("admin"))
            .authorities("read") // Solo tiene permisos de lectura
            .build();
// Creando el segundo usuario con nombre marc
    UserDetails user2 = User.builder()
            .username("marc")
            .password(this.passwordEncoder().encode("admin"))
            .authorities("read") // Solo tiene permisos de lectura
            .build();
// Creando el segundo usuario con nombre marc
    UserDetails user3 = User.builder()
            .username("admin")
            .password(this.passwordEncoder().encode("admin"))
            .authorities("read") // Solo tiene permisos de lectura
            .build();
    // Creando los usuarios user1 & user2
    userDetailsService.createUser(user1);
    userDetailsService.createUser(user2);
    return userDetailsService;

}
@Bean
public PasswordEncoder passwordEncoder(){
    // Encriptando las contraseñas
return new BCryptPasswordEncoder();
}

}
