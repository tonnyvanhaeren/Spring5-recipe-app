package guru.vanhaeren.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage()
    {
        System.out.println("Some Message to say... 555");
        return "index";
    }
}
