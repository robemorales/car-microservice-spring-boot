package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.InterfaceService.IcarService;
import com.example.demo.Model.Car;

@RestController
@RequestMapping("/car")
public class CarControllers {
	@Autowired
	private IcarService service;
	@GetMapping
	@RequestMapping(value = "all-cars", method = RequestMethod.GET)
	public ResponseEntity<?> getAllCar() {
		List<Car> cars = service.getAllCars();
		
		return ResponseEntity.ok(cars);
	}
	
	@PostMapping
	@RequestMapping(value = "add-car", method = RequestMethod.POST)
	public ResponseEntity<?> saveCar(@RequestBody Car c) {
		
		Car new_car = service.saveCar(c);
		return ResponseEntity.status(HttpStatus.CREATED).body(new_car);
		
	}
	
	@PutMapping
	@RequestMapping(value = "update-car", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCar(@RequestBody Car c) {
		
		Car new_car = service.updateCar(c);
		return ResponseEntity.status(HttpStatus.CREATED).body(new_car);
		
	}
	
	@DeleteMapping
	@RequestMapping(value = "delete-car/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> updateCar(@PathVariable Integer id) {
		
		service.deleteCar(id);
		return ResponseEntity.ok().build();
		
	}
}
