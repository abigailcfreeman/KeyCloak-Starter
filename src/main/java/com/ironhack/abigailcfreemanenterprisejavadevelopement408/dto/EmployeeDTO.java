package com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Admin;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    private String name;
    private String uuid;

    public static EmployeeDTO fromEntity(Employee entity) {
        var employeeDTODtoNew = new EmployeeDTO();
        employeeDTODtoNew.setName(entity.getName());
        employeeDTODtoNew.setUuid(entity.getUuid());
        return employeeDTODtoNew;
    }
}