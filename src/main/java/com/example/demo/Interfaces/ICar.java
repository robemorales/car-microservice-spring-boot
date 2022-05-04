package com.example.demo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Car;
@Repository
public interface ICar extends CrudRepository<Car, Integer> {

}
