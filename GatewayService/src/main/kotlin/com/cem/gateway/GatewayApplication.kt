package com.cem.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class GatewayApplication

fun main(args: Array<String>) {
	SpringApplication.run(GatewayApplication::class.java, *args)
}