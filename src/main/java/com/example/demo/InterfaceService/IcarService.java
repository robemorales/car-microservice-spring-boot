package com.example.demo.InterfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;

@Service
public interface IcarService {
	public List<Car>getAllCars();
	public Optional<Car>getCarsById(int id);
	public Car saveCar(Car c);
	public Car updateCar(Car c);
	public void deleteCar(int id);

}
