package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.InterfaceService.IcarService;
import com.example.demo.Interfaces.ICar;
import com.example.demo.Model.Car;
@Service
public class CarService implements IcarService {
	@Autowired
	private ICar data;

	@Override
	public List<Car> getAllCars() {
		return (List<Car>)data.findAll();
	}

	@Override
	public Optional<Car> getCarsById(int id) {
	
		return data.findById(id);
	}

	@Override
	public Car saveCar(Car c) {
		return data.save(c);
	}

	@Override
	public void deleteCar(int id) {
		data.deleteById(id);
		
	}

	@Override
	public Car updateCar(Car c) {
		
		return data.save(c);
	}
	
	

}
