package com.app.collaborators.controllers;

import com.app.collaborators.dto.CategoryDTO;
import com.app.collaborators.services.CategorieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/categories")
public class CategorieController {
    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService){

        this.categorieService = categorieService;
    }
    @GetMapping
    public List<CategoryDTO> listOfcategorie(){

        return categorieService.findAll()
                .stream()
                .sorted(CategoryDTO::compareTo)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CategoryDTO getCategorieById(@PathVariable Long id){

        return categorieService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryDTO saveCategorie(@RequestBody CategoryDTO categoryDto){

        return categorieService.save(categoryDto);
    }

    @PutMapping("/{id}")
    public CategoryDTO updateCategorie(@PathVariable Long id, @RequestBody CategoryDTO categorieDto){
        return categorieService.update(id, categorieDto);
    }
    @DeleteMapping("/{id}")
    public String deleteCategory(@PathVariable("id") Long id){

        categorieService.deleteById(id);

        return "Deleted successful";
    }



}
