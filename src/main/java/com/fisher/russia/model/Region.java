package com.fisher.russia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @ManyToOne
    @JoinColumn(name = "district_id")
    District district;
}
