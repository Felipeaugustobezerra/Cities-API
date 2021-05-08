package com.github.felipeaugustobezerra.cities.API.states.repository;

import com.github.felipeaugustobezerra.cities.API.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
