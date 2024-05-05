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

import static java.util.stream.Collectors.toList;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/districts")
    public List<String> getDistricts() {
        return mainService.getDistricts().stream()
                .map(District::getName)
                .collect(toList());
    }

    @GetMapping("/regions")
    public List<String> getRegions() {
        return mainService.getRegions().stream()
                .map(Region::getName)
                .collect(toList());
    }
}
