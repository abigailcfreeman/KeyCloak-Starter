package com.ironhack.abigailcfreemanenterprisejavadevelopement408.repository;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PizzaRepository  extends JpaRepository<Pizza, Long> {
    public Optional<Pizza> findById(Long id);
}