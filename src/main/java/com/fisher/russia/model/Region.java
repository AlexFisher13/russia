package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity(name = "regions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {
    @Id
    @JsonIgnore
    Long id;
    String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "district_id", referencedColumnName = "id")
    District district;
}
