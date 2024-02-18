package br.com.matheusgmello.placeservice.api;

import java.time.LocalDateTime;

public record PlaceResponse(String name, String slug, String city, String state,
        LocalDateTime createdAt, LocalDateTime updatedAt) {

}
