package com.example.demo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {

    @Id
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;
    private String email;

    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private List<Roles> roles = new ArrayList<>();

    public Users(){}

    public Users(String username, String password,String email, Roles role){
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles.add(role);
    }

    //GETTERS
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
    public List<Roles> getRoles(){
        return this.roles;
    }
    public Long getId(){
        return this.id;
    }
    //SETTERS
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setRoles(Roles role){
        this.roles.add(role);
    }
































}
