package com.cem.employee.model

data class EmployeeDTO(val empName: String = "", val deptId: Int? = null, val salary: Int? = null)

fun EmployeeDTO.toEmployee(): Employee {
	return Employee(emp_name = empName, dept_id = deptId, salary = salary)
}