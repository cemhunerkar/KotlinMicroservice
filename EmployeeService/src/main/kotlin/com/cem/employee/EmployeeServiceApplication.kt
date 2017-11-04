package com.cem.employee

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class EmployeeServiceApplication

fun main(args: Array<String>) {
	SpringApplication.run(EmployeeServiceApplication::class.java, *args)
}