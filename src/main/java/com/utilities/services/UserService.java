package com.utilities.services;

import com.utilities.domains.User;
import com.utilities.domains.View;
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
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @ReadOnly
    public User findById(Long userId) {
        return entityManager.find(User.class, userId);
    }

    @ReadOnly
    public List<View> getView() {
        return entityManager.createNativeQuery("select * from ytd_tenant_payments_2021", View.class).getResultList();
    }
}
