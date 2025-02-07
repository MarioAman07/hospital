package com.kz.aitu.oop.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

@GetMapping("/hospital/main")
    public String main() {
    return "Hospital Main Page";
}

}
