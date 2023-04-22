package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping
    public String devLanguages(){
        return "<h1>Skills Tracker</h1>" +
                "<h2>Here's a list of some Programming Languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String favLanguageForm(){
        return "<html>" +
                "<form action = 'response' method='post'>" +
                "<label>Name: <input type = 'text' name = 'name' /></label><br>" +
                "<label>My favorite language: <select name = 'lang1'></label>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<label>My second favorite language: <select name = 'lang2'></label>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<label>My third favorite language: <select name = 'lang3'></label>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type= 'submit' value = 'Submit' />" +
                "</form>" +
                "</html>";
    }
    @RequestMapping(method = RequestMethod.POST, value = "response")
    public String favLanguageResponse(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3){
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</html>";
    }
//    public String helloFormResults(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice){
//        return "Hello " + name + "!";
//    }
//
}
