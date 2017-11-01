package com.cem.department

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DeptServiceApplication

fun main(args: Array<String>) {
	SpringApplication.run(DeptServiceApplication::class.java, *args)
}