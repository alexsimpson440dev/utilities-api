package com.utilities.services;

import com.utilities.domains.Tenant;
import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class TenantService {

    private final EntityManager entityManager;

    public TenantService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<Tenant> findAll() {
        return entityManager.createQuery("select t from Tenant t", Tenant.class).getResultList();
    }
}
