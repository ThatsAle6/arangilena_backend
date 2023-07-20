package version1.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/vetrina")
public class VetrinaC {
    
    @GetMapping
    public String home() {
        return "home!";
    }

    @GetMapping("/chiSiamo")
    public String chiSiamo(){
        return "chi siamo!";
    }


}
