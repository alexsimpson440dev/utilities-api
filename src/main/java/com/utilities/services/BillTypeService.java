package com.utilities.services;

import com.utilities.domains.BillType;
import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class BillTypeService {

    private final EntityManager entityManager;

    public BillTypeService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<BillType> findAll() {
        return entityManager.createQuery("select b from BillType b", BillType.class).getResultList();
    }
}
