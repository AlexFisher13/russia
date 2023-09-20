package com.fisher.russia.dao;

import com.fisher.russia.model.District;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictDao extends JpaRepository<District, Long> {
    @Override
    @EntityGraph("graph-1")
    List<District> findAll();
}
