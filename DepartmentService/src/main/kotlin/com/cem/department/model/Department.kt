package com.cem.department.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "department")
class Department(@Id @GeneratedValue val dept_id: Int? = null,
				 val dept_name: String = "",
				 val dept_location: String = "")

fun Department.toDepartmentDTO(): DepartmentDTO = DepartmentDTO(this.dept_name, this.dept_location)