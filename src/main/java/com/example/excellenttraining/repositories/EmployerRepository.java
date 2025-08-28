package com.example.excellenttraining.repositories;
import com.example.excellenttraining.entities.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
