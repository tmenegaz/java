package com.mti.swplanetapi.domain.services;

import org.springframework.stereotype.Service;

import com.mti.swplanetapi.domain.entities.Planet;
import com.mti.swplanetapi.domain.repositories.PlanetRepository;

@Service
public class PlanetService {

  private PlanetRepository repository;

  public PlanetService(PlanetRepository repository) {
    this.repository = repository;
  }

  public Planet create(Planet obj) {
    return repository.save(obj);
  }
}
