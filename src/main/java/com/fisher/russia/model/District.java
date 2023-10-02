package com.fisher.russia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Getter
@Setter
@Entity(name = "districts")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NamedEntityGraph(name = "graph-1", attributeNodes = @NamedAttributeNode("regions"))
@NamedEntityGraph(name = "no-regions")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class District {
    @Id
    @JsonIgnore
    Long id;
    String name;
    @OneToMany(mappedBy = "district", fetch = FetchType.EAGER)
    List<Region> regions;
}
