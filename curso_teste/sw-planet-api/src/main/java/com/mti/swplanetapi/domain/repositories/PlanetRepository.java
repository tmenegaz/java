package com.mti.swplanetapi.domain.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mti.swplanetapi.domain.entities.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long> {

}
