package com.cem.employee.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "employees")
class Employee(@Id @GeneratedValue val emp_id: Int? = null,
			   val emp_name: String = "",
			   val dept_id: Int? = null,
			   val salary: Int? = null)

fun Employee.toEmployeeDTO(): EmployeeDTO = EmployeeDTO(this.emp_name, this.dept_id, this.salary)
