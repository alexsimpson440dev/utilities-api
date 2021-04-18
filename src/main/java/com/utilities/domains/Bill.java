package com.utilities.domains;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bill")
public class Bill {

    public Bill() {}

    public Bill(
            Long billId,
            Long propertyId,
            double totalAmount,
            double amountPerTenant,
            Date createdDate,
            Date dueDate
    ) {
        this.billId = billId;
        this.propertyId = propertyId;
        this.totalAmount = totalAmount;
        this.amountPerTenant = amountPerTenant;
        this.createdDate = createdDate;
        this.dueDate = dueDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long billId;

    private Long propertyId;

    private double totalAmount;

    private double amountPerTenant;

    private Date createdDate;

    private Date dueDate;

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getAmountPerTenant() {
        return amountPerTenant;
    }

    public void setAmountPerTenant(double amountPerTenant) {
        this.amountPerTenant = amountPerTenant;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createDate) {
        this.createdDate = createDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
