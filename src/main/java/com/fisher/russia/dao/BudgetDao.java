package com.fisher.russia.dao;

import com.fisher.russia.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetDao extends JpaRepository<Budget, Long> {
}
