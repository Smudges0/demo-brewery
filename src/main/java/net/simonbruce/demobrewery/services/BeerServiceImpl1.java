package net.simonbruce.demobrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import net.simonbruce.demobrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl1 implements BeerService{

    @Override
    public BeerDto getBeerByID(UUID beerId) {
        // TODO Auto-generated method stub
        return BeerDto.builder().id(UUID.randomUUID())
            .beerName("aBeerName")
            .beerStyle("aBeerStyle")
            .build();
    }
    
}
