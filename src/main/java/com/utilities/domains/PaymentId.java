package com.utilities.domains;

import java.io.Serializable;

public class PaymentId implements Serializable {

    private Long billId;

    private Long tenantId;

    public PaymentId() {}

    public PaymentId(Long billId, Long tenantId) {
        this.billId = billId;
        this.tenantId = tenantId;
    }
}
