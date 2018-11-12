package pl.sidor.service;

import pl.sidor.dao.UserDAO;
import pl.sidor.model.Adres;
import pl.sidor.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImlp implements UserDAO {

    private List<User> userList = new ArrayList<User>();

    public List<User> getAllUser() {
        User user = new User(1, "Karol", "Sidor", "karolsidor11@wp.pl", new Adres("Lublin", "Zana", 22, "21-000"));
        User user1 = new User(2, "Marek", "Nowak", "mareknowak@wp.pl", new Adres("Warszawa", "Spokojna", 12, "22-090"));
        User user2 = new User(3, "Adrian", "Woliński", "wolińskia@wp.pl", new Adres("Kraków", "Wesoła", 222, "21-290"));
        User user3 = new User(4, "Michał", "Szpak", "m.szpak@wp.pl", new Adres("Warszawa", "Wolska", 223, "21-060"));

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }

    public User addUser(User user) {
        userList.add(user);
        return user;
    }

    public void deleteUser(int id) {
        userList.remove(id);
    }

    public void updateUser(User user) {

        User user1 = userList.get(user.getId());
        user1.setName(user.getName());
        user1.setLastName(user.getLastName());
        user1.setAdres(user.getAdres());
        user1.setEmail(user.getEmail());

    }
}
