package com.utilities.services;

import com.utilities.domains.Bill;

import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class BillService {

    private final EntityManager entityManager;

    public BillService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<Bill> findAll() {
        return entityManager.createQuery("select b from Bill b", Bill.class).getResultList();
    }
}
