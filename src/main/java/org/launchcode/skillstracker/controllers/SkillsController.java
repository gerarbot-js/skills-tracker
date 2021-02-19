package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String trackerGreeting() {
        return "<html>" +
                "<body>" +
                "<h1>" + "Skills Tracker" + "</h1>" +
                "<h2>" + "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                "<li>" + "Java" + "</li>" +
                "<li>" + "JavaScript" + "</li>" +
                "<li>" + "Python" + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("favorites")
    public String printFavorites(@RequestParam String name, @RequestParam String favLanguage,
                                 @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>Favorite Language</th>" +
                "<th>Second Favorite Language</th>" +
                "<th>Third Favorite Language</th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + favLanguage + "</th>" +
                "<td>" + secondLanguage + "</th>" +
                "<td>" + thirdLanguage + "</th>" +
                "</tr>" +
                "</body>" +
                "</html>";
//                "<ol>" +
//                "<li>" + favLanguage + "</li>" +
//                "<li>" + secondLanguage + "</li>" +
//                "<li>" + thirdLanguage + "</li>" +
//                "</body>" +
//                "</html"; <--- still works without the last angle bracket
    }

    @GetMapping("form")
    public String rankLanguages() {
        return "<html>" +
                "<body>" +
                "<form action = '/favorites' method = 'post'>" +
                "<label>Name:<br></label><input type = 'text' name = 'name' />" +
                "<label><br>My favorite language:<br></label><select name = 'favLanguage'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<label><br>My second favorite language:<br></label><select name = 'secondLanguage'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<label><br>My third favorite language:<br></label><select name = 'thirdLanguage'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<button>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
