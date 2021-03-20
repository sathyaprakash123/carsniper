package com.benga.sniper;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benga.sniper.CarEntity;

public interface CarSniperRepo extends JpaRepository<CarEntity, String>{
	
	List<CarEntity> findAll();
	Optional<CarEntity> findBymodelName(String name);

}
