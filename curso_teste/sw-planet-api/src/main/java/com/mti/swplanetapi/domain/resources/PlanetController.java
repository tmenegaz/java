package com.mti.swplanetapi.domain.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mti.swplanetapi.domain.entities.Planet;
import com.mti.swplanetapi.domain.services.PlanetService;

@RestController
@RequestMapping("/planets")
public class PlanetController {

  @Autowired
  private PlanetService service;

  @PostMapping
  public ResponseEntity<Planet> create(@RequestBody Planet obj) {
    obj = service.create(obj);
    URI uri = ServletUriComponentsBuilder
    .fromCurrentContextPath()
    .path("/{id}")
    .buildAndExpand(obj.getId())
    .toUri();
    return ResponseEntity.created(uri).build();
  }
  
}
