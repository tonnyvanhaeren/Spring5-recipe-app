package guru.vanhaeren.recipe.services;

import guru.vanhaeren.recipe.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService{
    Set<UnitOfMeasureCommand> listAllUnitOfMeasures();
}
