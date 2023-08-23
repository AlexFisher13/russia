package com.fisher.russia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity(name = "regions")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {
    @Id
    Long id;
    String name;
}
