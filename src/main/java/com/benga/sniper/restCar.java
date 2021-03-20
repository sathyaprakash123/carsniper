package com.benga.sniper;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restCar {
	
	Logger logger = LoggerFactory.getLogger(restCar.class);

	@Autowired
	CarSniperRepo carsniperrepo;

	@PostMapping("/setcardetails")
	public CarPojo setCarDetails(@RequestBody CarPojo cardetail) {
		
		

		CarEntity car = new CarEntity();
		car.setModelName(cardetail.getModelName());
		car.setModelMaker(cardetail.getModelMaker());
		car.setModelPower(cardetail.getModelPower());
		car.setModelPrice(cardetail.getModelPrice());
		car.setModelType(cardetail.getModelType());
		carsniperrepo.save(car);
		return cardetail;

	}

	@GetMapping("/getcar/{name}")
	public CarPojo getCar(@PathVariable String name) {
		
		CarPojo car = new CarPojo();
		//Optional<CarEntity> carresult = carsniperrepo.findBymodelName(name);
		Optional<CarEntity> carresult = carsniperrepo.findById(name);
		
            if (carresult.isPresent())	{
            logger.info("Result present");
		    System.out.println("Requesting data for model : "+ name);
			car.setModelName(carresult.get().getModelName());
			car.setModelMaker(carresult.get().getModelMaker());
			car.setModelPower(carresult.get().getModelPower());
			car.setModelPrice(carresult.get().getModelPrice());
			car.setModelType(carresult.get().getModelType());
            }
            
            else
            {
            logger.info("No result retrieved from database");
            }
            

	

		return car;

	}

	@GetMapping("/pingtest")
	public String pingTest() {
		return "success";

	}

}
