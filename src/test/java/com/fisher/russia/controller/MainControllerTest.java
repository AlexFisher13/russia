package com.fisher.russia.controller;

import com.fisher.russia.model.Budget;
import com.fisher.russia.model.District;
import com.fisher.russia.model.Region;
import com.fisher.russia.service.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

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
}