package com.fisher.russia.controller;

import com.fisher.russia.model.Budget;
import com.fisher.russia.model.Region;
import com.fisher.russia.service.MainService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

@SpringBootTest
class MainControllerTest {
    @Autowired
    MainController controller;
    @Autowired
    MainService service;

    @Test
    void getDistricts() {
        IntSummaryStatistics regionCounts = controller.getDistricts().stream()
                .map(d -> d.getRegions().size())
                .collect(Collectors.summarizingInt(Integer::intValue));
        long count = controller.getBudgets().stream().filter(b -> b.getYear() == 2020).count();
        int size = controller.getRegions().size();

        System.out.println("Регионы из Округов " + regionCounts.getSum());
        System.out.println("Регионы из бюджета " + count);
        System.out.println("Регионы просто " + size);
    }

    @Test
   @Transactional
    void setBudget() {
        Region region = newRegion();
        Budget newBudget = newBudget();
        region.setBudgets(Collections.singletonList(newBudget));

        service.saveRegion(region);
    }

    Region newRegion() {
        Region region = new Region();
        region.setName("Кринжовский");
        region.setDistrict(service.getDistricts().get(1));
        region.setId((long) (Math.random()*1000));
        return region;
    }

    Budget newBudget() {
        Budget budget = new Budget();
        budget.setIncome(new BigDecimal(111));
        budget.setSpending(new BigDecimal(111));
        budget.setYear(2025);
        budget.setId((long) (Math.random()*1000));
        return budget;
    }
}