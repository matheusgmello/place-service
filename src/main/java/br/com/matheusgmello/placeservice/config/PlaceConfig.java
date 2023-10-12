package br.com.matheusgmello.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.matheusgmello.placeservice.domain.PlaceRepository;
import br.com.matheusgmello.placeservice.domain.PlaceService;

@Configuration
@EnableR2dbcAuditing // Para preencher o createdAt e updatedAt
public class PlaceConfig {
  @Bean
  PlaceService placeService(PlaceRepository placeRepository) {
    return new PlaceService(placeRepository);
  }
}