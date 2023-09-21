package org.example.Library;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> users;

    public User loggedInUser;

    public UserService(){
        users = new ArrayList<>();
    }

    public boolean LoginUser(String username, String password){

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                if(users.get(i).getPassword().equals(password)) {
                    //everything was correct
                    loggedInUser = users.get(i);
                    return true;
                }
            }
        }
        return false;
    }


    /* public void RegisterUser(String username, String password) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {

            }
        }

        User newUser = new User(username, password);
        users.add(newUser);


    } */

}
