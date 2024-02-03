package gurur.springframework.msscbrewer.services;

import gurur.springframework.msscbrewer.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
