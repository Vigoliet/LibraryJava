package org.example.Library;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<User> users;

    public User loggedInUser;


    public UserService(){
        users = new ArrayList<>();
    }

    public boolean loginUser(String username, String password){

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

    // Boolean because either it works or it doesn't
    public boolean registerUser(String username, String password) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(username)) {
                return false; // returns false since it already exists
            }
        }

        // if the username does not exist it runs this code instead
        User newUser = new User(username, password);
        users.add(newUser);
        return true;

    }

}
