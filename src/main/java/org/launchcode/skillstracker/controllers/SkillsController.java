package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

@GetMapping()
@ResponseBody
    public String languages() {
        return "<html>" +
                "<body>" +
                "<h1>" + "Skills Tracker" + "</h1>" +
                "<h2>" + "We have a few skills we would like to learn. Here is the list!" + "</h2>" +
                "<ol>" +
                "<li>" + "Java" + "</li>"
                + "<li>" + "JavaScript" + "</li>"
                + "<li>" + "Python" + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label>" + "Enter your name:" + "</label>" +
                "<input name='name'>" + "</input>" +

                "<p>" + "My favorite language" + "</p>" +
                "<select name=\"Lang 1\" id=\"language\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Python\">Python</option>" + "</select>" +

                "<p>" + "My second favorite language" + "</p>" +
                "<select name=\"Lang 3\" id=\"language\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Python\">Python</option>" + "</select>" +

                "<p>" + "My third favorite language" + "</p>" +
                "<select name=\"Lang 3\" id=\"language\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Python\">Python</option>" + "</select>" +
                "<br>" +
                "<input type=submit>" + "</input>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
