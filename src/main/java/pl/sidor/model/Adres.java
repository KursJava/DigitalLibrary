package pl.sidor.model;

import java.io.Serializable;

public class Adres implements Serializable {

    private String locality;
    private String street;
    private int streetNumber;
    private String zipCode;

    public Adres() {
    }

    public Adres(String locality, String street, int streetNumber, String zipCode) {
        this.locality = locality;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Adres{" + "locality='" + locality + '\'' + ", street='" + street + '\'' + ", streetNumber=" + streetNumber + ", zipCode='" + zipCode + '\'' + '}';
    }
}
