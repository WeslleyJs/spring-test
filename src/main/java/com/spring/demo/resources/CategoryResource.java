package com.spring.demo.resources;


import com.spring.demo.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = new ArrayList<Category>();
        categories.add(new Category(1L, "BOOKS"));
        categories.add(new Category(2L, "BOOKS"));

        return ResponseEntity.ok().body(categories);
    }
}
