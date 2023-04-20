package edu.c322final.reorderservice.controller;

import edu.c322final.reorderservice.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reorder")
public class ReorderController {
    @GetMapping("/{customerId}")
    public List<Order> getOrdersByCustomerId(@PathVariable int customerId) {
        // INCOMPLETE
        return new ArrayList<>();
    }
}
