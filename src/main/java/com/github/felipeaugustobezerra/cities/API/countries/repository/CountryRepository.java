package com.github.felipeaugustobezerra.cities.API.countries.repository;

import com.github.felipeaugustobezerra.cities.API.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
