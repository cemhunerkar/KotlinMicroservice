package com.cem.gateway.config

import com.cem.gateway.filter.ZuulPreFilter
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableZuulProxy
class ZuulConfig {

	@Bean
	fun zuulPreFilter(): ZuulPreFilter {
		return ZuulPreFilter()
	}
}