package com.fisher.russia.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Entity(name = "budgets")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Budget {
    @Id
    Long id;
    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;
    int year;
    BigDecimal amount;
}
