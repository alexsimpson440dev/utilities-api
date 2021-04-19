package com.utilities.domains;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class View {

    public View() {}

    public View(
            Long tenantId,
            String tenantName,
            double totalPaidYtd
    ) {
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.totalPaidYtd = totalPaidYtd;
    }

    @Id
    private Long tenantId;

    private String tenantName;

    private double totalPaidYtd;

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public double getTotalPaidYtd() {
        return totalPaidYtd;
    }

    public void setTotalPaidYtd(double totalPaidYtd) {
        this.totalPaidYtd = totalPaidYtd;
    }
}
