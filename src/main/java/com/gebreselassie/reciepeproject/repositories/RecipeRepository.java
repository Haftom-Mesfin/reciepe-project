package com.gebreselassie.reciepeproject.repositories;

import com.gebreselassie.reciepeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
