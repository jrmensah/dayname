package me.jrmensah.dayname;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("dayname") String dayname,
    Model model){
        model.addAttribute("daynameval", dayname);
//        model.addAttribute("theDay",dateClass.getTheDay());
//        model.addAttribute("theNiceDay",dateClass.getTheFormattedDay());
//        model.addAttribute("fullDate",dateClass.getLongFormat());
        return "confirm";
    }



}

