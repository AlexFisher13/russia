package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity(name = "regions")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {
    @Id
    @JsonIgnore
    Long id;
    String name;
    @ManyToOne
    District district;
}
