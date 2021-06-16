package com.example.demonti.service.impl;

import com.example.demonti.domain.Planet;
import com.example.demonti.repos.PlanetRepos;
import com.example.demonti.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlanetServiceImpl implements PlanetService {

    @Autowired
    private PlanetRepos planetRepos;

    @Override
    public Planet addPlanet(Planet planet) {
        return planetRepos.saveAndFlush(planet);
    }

    @Override
    public void delete(long id) {
        planetRepos.deleteById(id);
    }

    @Override
    public Iterable<Planet> findAll() {
        return planetRepos.findAll();
    }

    @Override
    public Optional<Planet> findById(Long planetid) {
        return planetRepos.findById(planetid);
    }

    @Override
    public void update(Planet planet) {
        planetRepos.save(planet);
    }


}
