package com.ironhack.abigailcfreemanenterprisejavadevelopement408.repository;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Admin;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}