package com.cem.employee.persistance

import com.cem.employee.model.Employee
import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee, Int>