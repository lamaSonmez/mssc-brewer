package gurur.springframework.msscbrewer.services;

import gurur.springframework.msscbrewer.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("BBBB")
                .beerStyle("DFSDS")
                .build();
    }
}
