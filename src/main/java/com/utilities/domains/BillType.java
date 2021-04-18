package com.utilities.domains;

import javax.persistence.*;

@Entity
@Table(name = "bill_type")
public class BillType {

    public BillType() {}

    public BillType(
            Long billTypeId,
            Long propertyId,
            String name,
            String description
    ) {
        this.billTypeId = billTypeId;
        this.propertyId = propertyId;
        this.name = name;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billTypeId;

    private Long propertyId;

    private String name;

    private String description;

    public Long getBillTypeId() {
        return billTypeId;
    }

    public void setBillTypeId(Long billTypeId) {
        this.billTypeId = billTypeId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
