package com.reactive.ReactiveProject.controller;

import com.reactive.ReactiveProject.dto.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.awt.*;
import java.time.Duration;

@RestController
@RequestMapping("/api/order")
public class OrderController {

   @GetMapping(value = "/getAll", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
   public Flux<Order> getAllOrders() {
      return Flux.just(
            new Order(1L, 100.0),
            new Order(2L, 200.0),
            new Order(3L, 300.0),
            new Order(4L, 400.0),
            new Order(5L, 500.0),
            new Order(6L, 600.0),
            new Order(7L, 700.0),
            new Order(8L, 800.0),
            new Order(9L, 900.0),
            new Order(10L, 1000.0),
            new Order(11L, 1000.0),
            new Order(12L, 2000.0),
            new Order(13L, 3000.0),
            new Order(14L, 4000.0),
            new Order(15L, 5000.0),
            new Order(16L, 6000.0),
            new Order(17L, 7000.0)
      ).delayElements(Duration.ofMillis(150)).log();
   }

   @GetMapping(value = "/getMono")
   public Mono<Order> getMono() {
      return Mono.just(new Order(16L, 6000.0));
   }
}
