package com.utilities.domains;

import javax.persistence.*;

@Entity
@Table(name = "tenant")
public class Tenant {

    public Tenant() {}

    public Tenant(Long tenantId, Long userId, Long propertyId) {
        this.tenantId = tenantId;
        this.userId = userId;
        this.propertyId = propertyId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tenantId;

    private Long userId;

    private Long propertyId;

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }
}
