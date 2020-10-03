package com.gebreselassie.reciepeproject.controllers;

import com.gebreselassie.reciepeproject.domain.Category;
import com.gebreselassie.reciepeproject.domain.UnitOfMeasure;
import com.gebreselassie.reciepeproject.repositories.CategoryRepository;
import com.gebreselassie.reciepeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","index","/index.html"})
    public  String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Category Id is " + categoryOptional.get().getId());
        System.out.println("Unit of measure Id is "+ unitOfMeasure.get().getId());
        return "index";
    }
}
