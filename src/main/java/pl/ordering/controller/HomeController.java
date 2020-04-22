package pl.ordering.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("a")
    public String apage() {
        return "a";
    }

    @GetMapping("index")
    public String index() {
     return "home";
    }

}
