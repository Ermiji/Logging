package com.company;
import java.util.List;

public class Role {
    private long id;
    private String name;
    private List<User> user;

    public Role(){

    }

    public Role(long id, String name, List<User> user){
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
