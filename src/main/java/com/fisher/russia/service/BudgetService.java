package com.fisher.russia.service;

import com.fisher.russia.dao.BudgetDao;
import com.fisher.russia.model.Budget;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetService {
    private final BudgetDao budgetDao;

    public List<Budget> getBudgets() {
        return budgetDao.findAll();
    }
}
