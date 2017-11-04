package com.cem.department.model

data class DepartmentDTO(val deptName: String = "", val deptLocation: String = "")

fun DepartmentDTO.toDepartment(): Department {
	return Department(dept_name = deptName, dept_location = deptLocation)
}