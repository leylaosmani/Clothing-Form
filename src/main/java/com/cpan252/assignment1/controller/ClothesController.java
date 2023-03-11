package com.cpan252.assignment1.controller;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.cpan252.assignment1.model.Clothes.Brands;
import java.util.List;
import org.springframework.ui.Model;
import com.cpan252.assignment1.model.Clothes;
import com.cpan252.assignment1.repository.ClothesRepository;
@Controller
public class ClothesController {

    private final ClothesRepository clothesRepository;

    public ClothesController(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }
    @GetMapping("/clothesList/sortByBrand")
    public String sortByBrand(Model model) {
        List<Clothes> clothesList = clothesRepository.findAll(Sort.by("brand"));
        model.addAttribute("clothesList", clothesList);
        return "clothesList";
    }
    @GetMapping("/clothes")
    public String showClothes(Model model) {
        model.addAttribute("clothes", new Clothes());
        model.addAttribute("brands", Brands.values());
        return "clothes";
    }

    @GetMapping("/clothesList")
    public String showClothesList(Model model) {
        List<Clothes> clothesList = clothesRepository.findAll();
        model.addAttribute("clothesList", clothesList);
        return "clothesList";
    }

    @PostMapping("/clothes")
    public String addClothes(@ModelAttribute("clothes") Clothes clothes) {
        clothesRepository.save(clothes);
        return "redirect:/clothesList";
    }
}