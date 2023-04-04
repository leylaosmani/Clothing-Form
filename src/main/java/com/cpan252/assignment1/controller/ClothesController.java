package com.cpan252.assignment1.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import com.cpan252.assignment1.model.Clothes.Brands;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.cpan252.assignment1.model.Clothes;
import com.cpan252.assignment1.repository.ClothesRepository;
import com.cpan252.assignment1.model.User;
import java.util.EnumSet;
@Controller
@Slf4j
@RequestMapping("/addition")
public class ClothesController {
    @Autowired
    private ClothesRepository clothesRepository;

    @GetMapping
    public String addition(){
        return "addition";
    }
    @ModelAttribute
    public void brand(Model model) {
        var brand = EnumSet.allOf(Brands.class);
        model.addAttribute("brands", brand);
        log.info("brands converted to string:  {}", brand);
    }
    @ModelAttribute
    public Clothes clothes(){
        return Clothes
        .builder()
        .build();
    }
    
    @PostMapping
    public String processClothesAddition(@Valid Clothes clothes, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("brands", EnumSet.allOf(Brands.class));
            return "addition";
        }
        log.info("Processing clothes: {}", clothes);
        clothesRepository.save(clothes);
        return "redirect:/clothesList";
    }

    @PostMapping("/deleteAllClothes")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String processClothesDeletion(@AuthenticationPrincipal User user) {
        log.info("Deleting all clothes for user: {}", user.getAuthorities());
        clothesRepository.deleteAll();
        return "redirect:/addition";
    }

}