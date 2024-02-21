package com.example.GameOfLife.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "users")
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // UserDetails interface methods

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email; // Using email as the username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // You can customize these fields according to your requirements
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // You can customize these fields according to your requirements
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // You can customize these fields according to your requirements
    }

    @Override
    public boolean isEnabled() {
        return true; // You can customize these fields according to your requirements
    }

    // Standard getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
