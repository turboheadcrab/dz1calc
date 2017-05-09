package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String getIndexPage() {
        return "index";
    }
}
