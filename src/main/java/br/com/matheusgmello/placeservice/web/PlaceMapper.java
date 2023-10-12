package br.com.matheusgmello.placeservice.web;

import br.com.matheusgmello.placeservice.api.PlaceResponse;
import br.com.matheusgmello.placeservice.domain.Place;

public class PlaceMapper {
  public static PlaceResponse fromPlaceToResponse(Place place){
    return new PlaceResponse(place.name(),
     place.slug(), place.state(), place.createdAt(), place.updatedAt());
  }
  
}
