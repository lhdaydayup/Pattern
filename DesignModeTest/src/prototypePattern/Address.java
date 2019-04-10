package prototypePattern;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String town;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
