package com.ironhack.abigailcfreemanenterprisejavadevelopement408.service;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.EmployeeDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Employee;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO create(EmployeeDTO employeeDTO) {
        var entity = Employee.fromDTO(employeeDTO);
        var storedMember = employeeRepository.save(entity);

        return employeeDTO.fromEntity(storedMember);
    }
}