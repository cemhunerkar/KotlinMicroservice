package com.cem.department

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class DeptServiceApplication

fun main(args: Array<String>) {
	SpringApplication.run(DeptServiceApplication::class.java, *args)
}