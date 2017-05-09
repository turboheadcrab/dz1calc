package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.itis.service.CalculationService;
import ru.kpfu.itis.util.CalculationFormValidator;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */

@Controller
@RequestMapping(value = "/calculations")
public class CalculationsController {

    @Autowired
    CalculationService calculationService;

    CalculationFormValidator validator = new CalculationFormValidator();

    @RequestMapping(value = "/all")
    public String showIntermediate(Model model) {
        model.addAttribute("calculations", calculationService.getAllCalculations());
        return "intermediate";
    }
}
