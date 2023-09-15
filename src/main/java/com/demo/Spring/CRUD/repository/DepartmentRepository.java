package com.demo.Spring.CRUD.repository;

import com.demo.Spring.CRUD.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}