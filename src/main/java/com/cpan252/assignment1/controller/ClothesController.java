package com.cpan252.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.cpan252.assignment1.model.Clothes.Brands;
import org.springframework.ui.Model;
@Controller
public class ClothesController {

    @GetMapping("/clothes")
    public String showClothes(Model model) {
        model.addAttribute("brands", Brands.values());
        return "clothes";
    }

}
