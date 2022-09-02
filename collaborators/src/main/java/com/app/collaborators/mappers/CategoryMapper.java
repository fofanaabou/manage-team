package com.app.collaborators.mappers;

import com.app.collaborators.dto.CategoryDTO;
import com.app.collaborators.entities.Categorie;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper categoryMapper = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO categoryToCategoryDto (Categorie categorie);
    Categorie categoryDtoToCategorie (CategoryDTO categoryDto);
}
