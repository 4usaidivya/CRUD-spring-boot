package com.demo.Spring.CRUD.controller;

// Java Program to Illustrate DepartmentController.java File



import java.util.List;
// Importing required classes
import javax.validation.Valid;
import com.demo.Spring.CRUD.entity.Department;
import com.demo.Spring.CRUD.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    // Save operation
    @PostMapping("/departments")

    public Department saveDepartment(
            @Valid @RequestBody Department department)
    {
        logger.info ("entering the controller");
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")

    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")

    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")

    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }
}
