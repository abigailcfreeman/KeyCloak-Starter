package com.ironhack.abigailcfreemanenterprisejavadevelopement408.model;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.EmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String uuid;

    public static Employee fromDTO(EmployeeDTO dto){
        var employeeNew = new Employee();
        employeeNew.setName(dto.getName());
        employeeNew.setUuid(dto.getUuid());
        return employeeNew;
    }
}