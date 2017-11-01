package com.cem.department.persistence

import com.cem.department.model.Department
import org.springframework.data.repository.CrudRepository

interface DepartmentRepository : CrudRepository<Department, Int>