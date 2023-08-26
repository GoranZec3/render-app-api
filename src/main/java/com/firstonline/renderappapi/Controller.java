package com.firstonline.renderappapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String caoKudi(){
        return "VOLI TE TVOJ KUDI KUDI KUDI :* :*";
    }
}
