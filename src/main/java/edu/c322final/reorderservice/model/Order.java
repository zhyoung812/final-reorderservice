package edu.c322final.reorderservice.model;

import java.util.List;

public record Order(int id,
                    int customerId,
                    ConcreteSandwich sandwich,
                    double total,
                    List<Side> sides) {}
