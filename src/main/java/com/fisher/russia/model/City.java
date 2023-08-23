package com.fisher.russia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity(name = "cities")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class City {
    @Id
    Long id;
    String name;
}
