package com.fisher.russia.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity(name = "districts")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class District {
    @Id
    Long id;
    String name;
    @OneToMany
    @JoinColumn(name = "region_id")
    List<Region> regions;
}
