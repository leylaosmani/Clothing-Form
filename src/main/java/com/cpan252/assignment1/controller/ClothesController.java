package com.cpan252.assignment1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ClothesController { 
  @GetMapping("/clothes")

public String clothes(){
    return "clothes";
}

}
