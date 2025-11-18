package dev.naoisemcg;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/newyear")
    public String newyear(Model model) {
        LocalDate today = new LocalDate();
        LocalDate newYear = today.plusYears(1).withDayOfYear(1);
        Days daysToNewYear = Days.daysBetween(today, newYear);
        model.addAttribute("days", daysToNewYear);
        return "newyear";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@RequestParam(defaultValue = "World") String name, Model model) {
        Greeting greeting = new Greeting();
        greeting.setName(name);
        model.addAttribute("greeting", greeting);
        return "greeting";
    }
}
