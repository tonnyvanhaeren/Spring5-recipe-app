package guru.vanhaeren.recipe.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private Long Id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
}
