package com.appprocesssors.ecomstore.restcontroller;


import com.appprocesssors.ecomstore.model.Order;
import com.appprocesssors.ecomstore.repository.OrdersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {


    private OrdersRepository ordersRepository;

    public OrdersController(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @GetMapping("/allorders")
    public List<Order> getAllOrders() {
        List<Order> allorders = this.ordersRepository.findAll();

        return allorders;
    }

    @GetMapping("/{phone}/allorders")
    public List<Order> getAllOrdersByPhone(@PathVariable String phone) {
        List<Order> allorders = this.ordersRepository.findAll();

        return allorders;
    }

    @PostMapping("/addorder")
    public void addOrder(@RequestBody Order order) {
        this.ordersRepository.insert(order);
    }



}
