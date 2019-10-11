package com.stackroute.springbootzoolgatewayproxy;

import com.netflix.zuul.exception.ZuulException;
import com.stackroute.springbootzoolgatewayproxy.filters.ErrorFilter;
import com.stackroute.springbootzoolgatewayproxy.filters.PostFilter;
import com.stackroute.springbootzoolgatewayproxy.filters.PreFilter;
import com.stackroute.springbootzoolgatewayproxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class SpringbootZoolGatewayProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZoolGatewayProxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
