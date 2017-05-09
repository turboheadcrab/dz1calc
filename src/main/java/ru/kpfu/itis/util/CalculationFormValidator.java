package ru.kpfu.itis.util;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kpfu.itis.model.Calculation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */
public class CalculationFormValidator implements Validator {

    static Pattern pattern = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");

    @Override
    public boolean supports(Class<?> aClass) {
        return Calculation.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Calculation calculation = (Calculation) o;

        Matcher matcherIntm = pattern.matcher(calculation.getIntermediateValue().toString());
        Matcher matcherNew = pattern.matcher(calculation.getNewValue().toString());

        if (!matcherIntm.matches()) {
            errors.rejectValue("intermediateValue", "", "This can only be floating point number");
        }
        if (!matcherNew.matches()) {
            errors.rejectValue("newValue", "", "This can only be floating point number");
        }
    }
}
