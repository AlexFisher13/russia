package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@Entity(name = "districts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class District {
    @Id
    @JsonIgnore
    Long id;
    String name;
    @OneToMany(mappedBy = "district", fetch = FetchType.EAGER)
    List<Region> regions;
}
