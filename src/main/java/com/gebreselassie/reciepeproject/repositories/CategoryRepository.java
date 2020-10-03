package com.gebreselassie.reciepeproject.repositories;

import com.gebreselassie.reciepeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
