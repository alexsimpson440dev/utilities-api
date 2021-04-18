package com.utilities.services;

import com.utilities.domains.Landlord;
import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class LandlordService {

    private final EntityManager entityManager;

    public LandlordService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<Landlord> findAll() {
        return entityManager.createQuery("select l from Landlord l", Landlord.class).getResultList();
    }
}
