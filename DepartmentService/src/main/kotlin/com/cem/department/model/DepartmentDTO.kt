package com.cem.department.model

data class DepartmentDTO(val dept_name: String = "", val dept_location: String = "")

fun DepartmentDTO.toDepartment(): Department {
	return Department(dept_name = dept_name, dept_location = dept_location)
}