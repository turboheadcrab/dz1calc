package ru.kpfu.itis.service;

import ru.kpfu.itis.model.Calculation;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */
public interface CalculationService {

    List<Calculation> getAllCalculations();
}
