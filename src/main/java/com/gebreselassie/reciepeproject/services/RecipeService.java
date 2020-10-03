package com.gebreselassie.reciepeproject.services;

import com.gebreselassie.reciepeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
