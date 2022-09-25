package com.ironhack.abigailcfreemanenterprisejavadevelopement408.service;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.AdminDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.PizzaDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Pizza;

import java.util.List;

public interface PizzaService {

    //FIND ALL PIZZA
    List<PizzaDTO> findAll();

    //CREATE PIZZA
    PizzaDTO create(PizzaDTO pizzaDTO);

    //UPDATE PIZZA
    void update(Long id, Pizza ingredient);

    //DELETE PIZZA
    void delete(Long id);
}