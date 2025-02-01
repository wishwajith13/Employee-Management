package com.jeewaeducation.department_service.repository;

import com.jeewaeducation.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
