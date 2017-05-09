package ru.kpfu.itis.repository;

import ru.kpfu.itis.model.Calculation;

import java.util.List;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */
public interface CalculationRepository {

    List<Calculation> getAllCalculations();

    void clearCalculations();

    void addCalculation(Calculation calculation);
}
