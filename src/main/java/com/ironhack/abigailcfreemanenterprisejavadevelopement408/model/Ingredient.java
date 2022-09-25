package com.ironhack.abigailcfreemanenterprisejavadevelopement408.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Ingredient {

    private Boolean vegetable;

    private Boolean glutenFree;
}