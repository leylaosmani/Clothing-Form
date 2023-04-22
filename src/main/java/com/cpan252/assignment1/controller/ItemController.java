package com.cpan252.assignment1.controller;

import java.util.EnumSet;

import com.cpan252.assignment1.model.Clothes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

// import com.cpan252.assignment1.model.dto.ItemDto;

@Controller
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:8082")
public class ItemController {
    private RestTemplate restTemplate;

    public ItemController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String dashboard() {
        return "item";
    }
    @ModelAttribute
    public void brand(Model model) {
        var brandnames = EnumSet.allOf(Clothes.Brands.class);
        model.addAttribute("brandnames", brandnames);

    }

    @ModelAttribute
    // This model attribute has a lifetime of a request
    public Clothes clothes() {
        return Clothes
                .builder()
                .build();
    }

}
