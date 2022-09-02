package com.app.collaborators.services;

import com.app.collaborators.dto.CategoryDTO;
import com.app.collaborators.entities.Categorie;
import com.app.collaborators.mappers.CategoryMapper;
import com.app.collaborators.repositories.CategorieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategorieServiceImpl implements  CategorieService {

    private final CategorieRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    @Override
    public List<CategoryDTO> findAll() {
        return categoryRepository.findAll()
                .stream()
                .map(categoryMapper::categoryToCategoryDto)
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO findById(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .map(categoryMapper::categoryToCategoryDto)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDto) {
        return saveAndReturnDTO(categoryMapper.categoryDtoToCategorie(categoryDto));

    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public CategoryDTO update(Long id, CategoryDTO categoryDto) {
        Categorie category = categoryMapper.categoryDtoToCategorie(categoryDto);
        category.setId(id);

        return saveAndReturnDTO(category);
    }

    private CategoryDTO saveAndReturnDTO(Categorie category){
        Categorie saveCategory = categoryRepository.save(category);

        return categoryMapper.categoryToCategoryDto(saveCategory);
    }
}
