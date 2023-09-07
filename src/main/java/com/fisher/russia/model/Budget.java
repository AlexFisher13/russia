package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    Long id;
    @OneToOne
    Region region;
    int year;
    BigDecimal income;
    BigDecimal spending;
}
