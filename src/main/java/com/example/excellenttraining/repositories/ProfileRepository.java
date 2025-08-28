package com.example.excellenttraining.repositories;
import com.example.excellenttraining.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProfileRepository extends JpaRepository<Profile, Long>{
}
