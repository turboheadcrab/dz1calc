package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.Calculation;
import ru.kpfu.itis.repository.CalculationRepository;
import ru.kpfu.itis.service.CalculationService;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */

@Service
public class CalculationServiceImpl implements CalculationService {

    @Autowired
    CalculationRepository repository;

    @Override
    public List<Calculation> getAllCalculations() {
        return repository.getAllCalculations();
    }
}
