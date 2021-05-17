package com.example.codeclan.pirateservice.Repositories;

import com.example.codeclan.pirateservice.Models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {
}
