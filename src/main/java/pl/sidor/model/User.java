package pl.sidor.model;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private Adres adres;

    public User() {
    }

    public User(int id, String name, String lastName, String email, Adres adres) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", adres=" + adres + '}';
    }
}
