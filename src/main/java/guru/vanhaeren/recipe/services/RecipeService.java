package guru.vanhaeren.recipe.services;

import guru.vanhaeren.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
