package com.cem.gateway.filter

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext

class ZuulPreFilter : ZuulFilter() {

	override fun run(): Any? {
		val requestContext = RequestContext.getCurrentContext()
		val request = requestContext.request
		val method = request.getMethod()
		val url = request.getRequestURL().toString()
		println("New $method request from $url")
		return null
	}

	override fun shouldFilter(): Boolean {
		return true
	}

	override fun filterType(): String {
		return "pre"
	}

	override fun filterOrder(): Int {
		return 0
	}
}