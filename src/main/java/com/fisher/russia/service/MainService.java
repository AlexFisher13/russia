package com.fisher.russia.service;

import com.fisher.russia.dao.BudgetDao;
import com.fisher.russia.dao.DistrictDao;
import com.fisher.russia.dao.RegionDao;
import com.fisher.russia.model.Budget;
import com.fisher.russia.model.District;
import com.fisher.russia.model.Region;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final BudgetDao budgetDao;
    private final DistrictDao districtDao;
    private final RegionDao regionDao;

    public List<Budget> getBudgets() {
        return budgetDao.findAll();
    }

    public List<District> getDistricts() {
        return districtDao.findAll();
    }

    public List<Region> getRegions() {
        return regionDao.findAll();
    }

    public void saveBudget(Budget budget) {
        budgetDao.save(budget);
    }

    public void saveRegion(Region region) {
        regionDao.save(region);
    }
}
