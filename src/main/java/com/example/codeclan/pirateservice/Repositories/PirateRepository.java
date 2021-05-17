package com.example.codeclan.pirateservice.Repositories;
import com.example.codeclan.pirateservice.Models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long>{
}
