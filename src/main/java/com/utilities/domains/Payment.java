package com.utilities.domains;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "payment")
@IdClass(PaymentId.class)
public class Payment {

    public Payment() {}

    public Payment(Long billId, Long tenantId, Date datePaid) {
        this.billId = billId;
        this.tenantId = tenantId;
        this.datePaid = datePaid;
    }

    @Id
    private Long billId;

    @Id
    private Long tenantId;

    private Date datePaid;

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Date getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(Date datePaid) {
        this.datePaid = datePaid;
    }
}
