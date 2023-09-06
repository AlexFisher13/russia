package com.fisher.russia.controller;

import com.fisher.russia.model.Budget;
import com.fisher.russia.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BudgetController {
    private final BudgetService budgetService;

    @GetMapping("/budgets")
    public List<Budget> getBudgets() {
        return budgetService.getBudgets();
    }
}
