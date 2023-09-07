package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity(name = "districts")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class District {
    @Id
    @JsonIgnore
    Long id;
    String name;
}
