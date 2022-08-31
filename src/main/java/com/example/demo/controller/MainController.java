package com.example.demo.controller;

import com.example.demo.service.OrdersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class MainController {

    private final OrdersService ordersService;

    public MainController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/fetch-product")
    public List<String> getFetchProduct(@RequestParam String name) {
        return ordersService.getProductName(name);
    }
}
