package com.cem.department

import com.cem.department.model.DepartmentDTO
import com.cem.department.model.toDepartmentDTO
import com.cem.department.model.toDepartment
import com.cem.department.persistence.DepartmentRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder
import java.net.URI

@RestController
class DepartmentController(val deptRepo: DepartmentRepository) {

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/dept/{deptId}")
	fun getDept(@PathVariable deptId: String): DepartmentDTO {
		return deptRepo.findOne(deptId.toInt()).toDepartmentDTO()
	}

	@PostMapping("/dept")
	fun createUser(@RequestBody deptDTO: DepartmentDTO, builder: UriComponentsBuilder): ResponseEntity<Unit> {
		val createdUserURI = builder.path("/{deptId}").buildAndExpand(deptRepo.save(deptDTO.toDepartment()).dept_id).toUriString()
		return ResponseEntity.created(URI(createdUserURI)).build()
	}
}