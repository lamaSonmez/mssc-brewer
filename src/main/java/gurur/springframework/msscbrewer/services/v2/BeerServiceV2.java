package gurur.springframework.msscbrewer.services.v2;

import gurur.springframework.msscbrewer.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);
}
