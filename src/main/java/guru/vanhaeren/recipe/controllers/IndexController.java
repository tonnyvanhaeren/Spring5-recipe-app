package guru.vanhaeren.recipe.controllers;

import guru.vanhaeren.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model)
    {
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
