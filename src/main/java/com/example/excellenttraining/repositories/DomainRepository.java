package com.example.excellenttraining.repositories;

import com.example.excellenttraining.entities.Domain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DomainRepository extends JpaRepository<Domain, Long> {
    Optional<Domain> findByLibel(String libel);
}
