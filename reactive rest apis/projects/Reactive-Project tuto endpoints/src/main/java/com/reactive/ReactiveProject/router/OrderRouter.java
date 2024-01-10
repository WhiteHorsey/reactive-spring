package com.reactive.ReactiveProject.router;

import com.reactive.ReactiveProject.handler.OrderHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


@Component
public class OrderRouter {
	
	@Autowired
	OrderHandler orderHandler;

	@Bean
	public RouterFunction<ServerResponse> orderRoutes() {
		return RouterFunctions
				.route(RequestPredicates.GET("/api/orderHandler/getAll"),
						orderHandler::getAll)
				.andRoute(RequestPredicates.GET("/api/orderHandler/getOne"),
						orderHandler::getOne);
	}
}
