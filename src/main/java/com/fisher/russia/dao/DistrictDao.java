package com.fisher.russia.dao;

import com.fisher.russia.model.District;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DistrictDao extends JpaRepository<District, Long> {
}
