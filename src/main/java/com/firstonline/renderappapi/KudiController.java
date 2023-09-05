package com.firstonline.renderappapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class KudiController {

    @GetMapping("/")
    public String caoKudi(){
        return "VOLI TE TVOJ KUDI KUDI KUDI :* :*";
    }

    @GetMapping("/next")
    public String nextPage(){
        return "this is next page";
    }

    @GetMapping("/home")
    public String kudi(){
        return "home";
    }

}
