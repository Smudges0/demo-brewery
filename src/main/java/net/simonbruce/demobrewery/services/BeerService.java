package net.simonbruce.demobrewery.services;

import java.util.UUID;

import net.simonbruce.demobrewery.web.model.BeerDto;

public interface BeerService {
    BeerDto getBeerByID(UUID beerId);
}
