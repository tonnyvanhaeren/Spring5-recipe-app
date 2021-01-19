package guru.vanhaeren.recipe.repositories;

import guru.vanhaeren.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
