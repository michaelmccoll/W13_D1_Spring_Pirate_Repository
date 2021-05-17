package com.example.codeclan.pirateservice.Repositories;
import com.example.codeclan.pirateservice.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
