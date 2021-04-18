package com.utilities.services;

import com.utilities.domains.Property;
import io.micronaut.transaction.annotation.ReadOnly;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;

@Singleton
public class PropertyService {

    private final EntityManager entityManager;

    public PropertyService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @ReadOnly
    public List<Property> findAll() {
        return entityManager.createQuery("select p from Property p", Property.class).getResultList();
    }
}
