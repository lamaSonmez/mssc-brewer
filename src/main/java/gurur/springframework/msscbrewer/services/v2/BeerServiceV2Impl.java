package gurur.springframework.msscbrewer.services.v2;

import gurur.springframework.msscbrewer.web.model.BeerDto;
import gurur.springframework.msscbrewer.web.model.v2.BeerDtoV2;
import gurur.springframework.msscbrewer.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements  BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("BBBB")
                .beerStyle(BeerStyleEnum.STYLE1)
                .build();
    }
}
