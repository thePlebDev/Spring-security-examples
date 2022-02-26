package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn
    private Users users;

    public Roles(){}

    public Roles(String name,Users user){
        this.name = name;
        this.users = user;
    }
    //GETTERS
    public String getName(){
        return this.name;
    }
    public Long getId(){
        return this.id;
    }
    public Users getUser(){
        return this.users;
    }
    //SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setUser(Users user){
        this.users = user;
    }























}
