package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Department;

public interface DepartmentRepository  extends JpaRepository<Department, Long> {

}
