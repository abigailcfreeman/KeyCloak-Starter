package com.ironhack.abigailcfreemanenterprisejavadevelopement408.controller;

import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.AdminDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.EmployeeDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.dto.PizzaDTO;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.model.Pizza;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.service.AdminService;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.service.EmployeeService;
import com.ironhack.abigailcfreemanenterprisejavadevelopement408.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaController {
    @Autowired
    AdminService adminService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    PizzaService pizzaService;

    //CREATE ADMIN
    @PostMapping("/admin/create/admin")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAdmin(@RequestBody AdminDTO adminDTO) {
        adminService.create(adminDTO);
    }

    //CREATE EMPLOYEE
    @PostMapping("/admin/create/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.create(employeeDTO);
    }

    //PUBLIC GET ALL PIZZA
    @GetMapping("/public/pizza")
    @ResponseStatus(HttpStatus.OK)
    public List<PizzaDTO> helloPizzas() {
        return pizzaService.findAll();
    }

    //ADMIN & EMPLOYEE CREATE PIZZA
    @PostMapping("/employee/pizza")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPizza(@RequestBody PizzaDTO pizzaDTO) {pizzaService.create(pizzaDTO);}

    //ADMIN DELETE PIZZA
    @DeleteMapping("/admin/pizza/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createPizza(@PathVariable Long id) {pizzaService.delete(id);}

    //UPDATE INGREDIENT PIZZA
    @PatchMapping("/employee/update-pizza/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeName(@PathVariable Long id, @RequestBody Pizza ingredient) {
        pizzaService.update(id, ingredient);
    }
}