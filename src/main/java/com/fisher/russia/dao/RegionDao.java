package com.fisher.russia.dao;

import com.fisher.russia.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionDao extends JpaRepository<Region, Long> {
}
