package com.utilities.services;

import com.utilities.domains.Tenant;
import com.utilities.domains.User;
import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class UserService {

    private final EntityManager entityManager;

    public UserService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @ReadOnly
    public List<Tenant> findAllTenants() {
        return entityManager.createQuery("from Tenant", Tenant.class).getResultList();
    }
}
