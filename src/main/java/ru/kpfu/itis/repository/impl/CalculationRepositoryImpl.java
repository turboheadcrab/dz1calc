package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import ru.kpfu.itis.model.Calculation;
import ru.kpfu.itis.model.Operation;
import ru.kpfu.itis.repository.CalculationRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */

@Repository
public class CalculationRepositoryImpl implements CalculationRepository {

    private List<Calculation> calculations = new ArrayList<Calculation>() {{
        add(new Calculation((double)23, (double)23, Operation.PLUS));
    }};

    @Override
    public List<Calculation> getAllCalculations() {
        return calculations;
    }

    @Override
    public void clearCalculations() {
        calculations.clear();
    }

    @Override
    public void addCalculation(Calculation calculation) {
        calculations.add(calculation);
    }
}
