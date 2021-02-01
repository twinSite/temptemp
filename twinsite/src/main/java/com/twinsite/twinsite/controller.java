package com.twinsite.twinsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping(value = "/")
    public String m()
    {
        return "temp";
    }
}

