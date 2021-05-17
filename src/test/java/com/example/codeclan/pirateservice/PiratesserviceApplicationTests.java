package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.Models.Raid;
import com.example.codeclan.pirateservice.Repositories.PirateRepository;
import com.example.codeclan.pirateservice.Repositories.RaidRepository;
import com.example.codeclan.pirateservice.Repositories.ShipRepository;
import com.example.codeclan.pirateservice.Models.Pirate;
import com.example.codeclan.pirateservice.Models.Ship;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase
@SpringBootTest
class PirateserviceApplicationTests {

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Autowired
	PirateRepository pirateRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Ship ship1 = new Ship("Black Pearl");
		shipRepository.save(ship1);
		Raid raid1 = new Raid("Edinburgh","Treasure");
		raidRepository.save(raid1);
		Pirate jack = new Pirate("Jack","Sparrow",32,ship1,raid1);
		pirateRepository.save(jack);
	}

}
