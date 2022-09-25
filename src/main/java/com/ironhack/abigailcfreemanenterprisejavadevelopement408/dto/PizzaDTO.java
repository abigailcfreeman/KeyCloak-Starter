package com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Pizza;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PizzaDTO {

        private String name;
        private BigDecimal price;
        private double rating;

        //Ingredient
        private Boolean vegetable;
        private Boolean glutenFree;

        public static PizzaDTO fromEntity(Pizza entity) {
            var pizzaDtoNew = new PizzaDTO();
            pizzaDtoNew.setName(entity.getName());
            pizzaDtoNew.setPrice(entity.getPrice());
            pizzaDtoNew.setRating(entity.getRating());

            if (entity.getIngredients() != null) {
                pizzaDtoNew.setVegetable(entity.getIngredients().getVegetable());
                pizzaDtoNew.setGlutenFree(entity.getIngredients().getGlutenFree());
            }

            return pizzaDtoNew;
        }
}