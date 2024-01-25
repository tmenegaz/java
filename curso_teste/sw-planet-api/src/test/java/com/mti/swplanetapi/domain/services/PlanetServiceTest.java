package com.mti.swplanetapi.domain.services;

import static com.mti.swplanetapi.common.PlanetConstants.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mti.swplanetapi.domain.entities.Planet;
import com.mti.swplanetapi.domain.repositories.PlanetRepository;

@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {

  @InjectMocks
  private PlanetService planetService;

  @Mock
  private PlanetRepository planetRepository;


  // operacao_estado_restorno
  @Test
  public void createPlanet_WithValidate_ReturnsPlanet() {

    when(planetRepository.save(PLANET))
    .thenReturn(PLANET);

    // sut = system under test
    Planet sut = planetService.create(PLANET);

    assertThat(sut).isEqualTo(PLANET);
    
  }

  @Test
  public void createPlanet_withinvalidDate_ThrowsException() {

    when(planetRepository.save(INVALID_PLANET))
    .thenThrow(RuntimeException.class);

    assertThatThrownBy(() -> planetService.create(INVALID_PLANET))
    .isInstanceOf(RuntimeException.class);

  }
}
