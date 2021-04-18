package com.utilities.domains;

import javax.persistence.*;

@Entity
@Table(name = "property")
public class Property {

    public Property() {}

    public Property(
            Long propertyId,
            Long landlordId,
            String address,
            String city,
            int zip,
            String state
    ) {
        this.propertyId = propertyId;
        this.landlordId = landlordId;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long propertyId;

    private Long landlordId;

    private String address;

    private String city;

    private int zip;

    private String state;

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public Long getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Long landlordId) {
        this.landlordId = landlordId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
