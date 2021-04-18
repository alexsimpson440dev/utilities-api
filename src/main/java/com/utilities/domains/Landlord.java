package com.utilities.domains;

import javax.persistence.*;

@Entity
@Table(name = "landlord")
public class Landlord {

    public Landlord() {}

    public Landlord(Long landlordId, Long userId) {
        this.landlordId = landlordId;
        this.userId = userId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long landlordId;

    private Long userId;

    public Long getLandlordId() {
        return landlordId;
    }

    public void setLandlordId(Long landlordId) {
        this.landlordId = landlordId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
