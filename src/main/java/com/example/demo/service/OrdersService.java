package com.example.demo.service;

import com.example.demo.repository.OrdersRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<String> getProductName(String customerName) {
        return ordersRepository.getProductName(customerName);
    }
}
