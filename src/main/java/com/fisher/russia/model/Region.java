package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Entity(name = "regions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {
    @Id
    @JsonIgnore
    Long id;
    String name;
    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "id")
    @JsonManagedReference
    District district;
    @JsonManagedReference
    @OneToMany(mappedBy = "region")
    List<Budget> budgets;
}
