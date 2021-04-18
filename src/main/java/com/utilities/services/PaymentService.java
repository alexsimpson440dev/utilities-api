package com.utilities.services;

import com.utilities.domains.Payment;
import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class PaymentService {

    private final EntityManager entityManager;

    public PaymentService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<Payment> findAll() {
        return entityManager.createQuery("select p from Payment p", Payment.class).getResultList();
    }
}
