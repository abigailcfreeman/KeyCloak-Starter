package com.ironhack.abigailcfreemanenterprisejavadevelopement408.model;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.PizzaDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Embedded
    private Ingredient ingredients;

    private BigDecimal price;

    @Size(min=1, max=5)
    private double rating;

        public static Pizza fromDTO(PizzaDTO dto){
            var pizzaNew = new Pizza();
            pizzaNew.setName(dto.getName());
            pizzaNew.setPrice(dto.getPrice());
            pizzaNew.setRating(dto.getRating());
            var ingredient = new Ingredient();
            if(dto.getVegetable() != null) ingredient.setVegetable(dto.getVegetable());
            if(dto.getGlutenFree() != null) ingredient.setGlutenFree(dto.getGlutenFree());
            pizzaNew.setIngredients(ingredient);

            return pizzaNew;
        }
}