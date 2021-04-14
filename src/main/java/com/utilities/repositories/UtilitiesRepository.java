package com.utilities.repositories;

import com.utilities.domains.User;

import java.util.Optional;

public interface UtilitiesRepository {

    Optional<User> findById(Long id);
}
