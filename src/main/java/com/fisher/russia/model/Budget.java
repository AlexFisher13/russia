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
    @JoinColumn(name = "region_id")
    Region region;
    int year;
    BigDecimal amount;
}
