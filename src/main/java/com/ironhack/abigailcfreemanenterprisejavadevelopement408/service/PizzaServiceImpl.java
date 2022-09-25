package com.ironhack.abigailcfreemanenterprisejavadevelopement408.service;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.PizzaDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Pizza;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    PizzaRepository repository;

    @Override
    public List<PizzaDTO> findAll() {
        var all = repository.findAll();
        List<PizzaDTO> allDTO = new ArrayList<>();
        for (Pizza pizza : all) {
            allDTO.add(PizzaDTO.fromEntity(pizza));
        }
        return allDTO;
    }

    @Override
    public PizzaDTO create(PizzaDTO pizzaDTO){
        var entity = Pizza.fromDTO(pizzaDTO);
        var storedMember = repository.save(entity);

        return pizzaDTO.fromEntity(storedMember);
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, Pizza ingredient) {
        if (ingredient.getIngredients() != null) {
            if(ingredient.getIngredients().getGlutenFree() != null){
                Pizza pizzaToEdit = repository.findById(id).get();
                pizzaToEdit.getIngredients().setGlutenFree(ingredient.getIngredients().getGlutenFree());
                repository.save(pizzaToEdit);
            }
            else{
                Pizza pizzaToEdit = repository.findById(id).get();
                pizzaToEdit.getIngredients().setVegetable(ingredient.getIngredients().getVegetable());
                repository.save(pizzaToEdit);
            }
        }

    }
}