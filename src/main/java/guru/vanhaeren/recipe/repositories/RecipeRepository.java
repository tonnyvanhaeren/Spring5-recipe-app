package guru.vanhaeren.recipe.repositories;

import guru.vanhaeren.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
