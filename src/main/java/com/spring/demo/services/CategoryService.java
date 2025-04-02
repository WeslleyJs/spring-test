package com.spring.demo.services;

import com.spring.demo.dto.CategoryDTO;
import com.spring.demo.entities.Category;
import com.spring.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return categories
                .stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}
