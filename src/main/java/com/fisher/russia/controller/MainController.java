package com.fisher.russia.controller;

import com.fisher.russia.model.Budget;
import com.fisher.russia.model.District;
import com.fisher.russia.model.Region;
import com.fisher.russia.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/budgets")
    public List<Budget> getBudgets() {
        return mainService.getBudgets();
    }

    @GetMapping("/districts")
    public List<District> getDistricts() {
        return mainService.getDistricts();
    }

    @GetMapping("/regions")
    public List<Region> getRegions() {
        return mainService.getRegions();
    }

    @PostMapping("/budgets")
    public void setBudget(@RequestBody Budget budget) {
        mainService.saveBudget(budget);
    }
}
