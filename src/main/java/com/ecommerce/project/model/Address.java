package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="addresses")
@Data
@AllArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5, message = "Street name must be at-least 5 characters")
    private String street;

    @NotBlank
    @Size(min = 5, message = "Building name must be at-least 5 characters")
    private String buildingName;

    @NotBlank
    @Size(min = 4, message = "City name must be at-least 4 characters")
    private String city;

    @NotBlank
    @Size(min = 3, message = "State name must be at-least 3 characters")
    private String state;

    @NotBlank
    @Size(min = 2, message = "Country name must be at-least 2 characters")
    private String country;

    @NotBlank
    @Size(min = 6, message = "PinCode must be at-least 6 characters")
    private String pinCode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users = new ArrayList<>();

    public Address(){}
    public Long getAddressId() { return addressId;}
    public void setAddressId(Long addressId) { this.addressId = addressId; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getBuildingName() { return buildingName; }
    public void setBuildingName(String buildingName) { this.buildingName = buildingName; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getPinCode() { return pinCode; }
    public void setPinCode(String pinCode) { this.pinCode = pinCode;}
    public List<User> getUsers() { return users; }
    public void setUsers(List<User> users) { this.users = users;}
    public Address(String street, String buildingName, String city, String state, String country, String pinCode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }


}
