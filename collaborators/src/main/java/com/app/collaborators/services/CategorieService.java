package com.app.collaborators.services;


import com.app.collaborators.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieService {
    List<CategoryDTO> findAll();

    CategoryDTO findById(Long categoryId);
    CategoryDTO save(CategoryDTO categoryDto);

    void deleteById(Long id);
    CategoryDTO update(Long id, CategoryDTO categoryDto);
}
