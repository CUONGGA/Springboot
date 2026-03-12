package com.example.demo.controller;

import com.example.demo.service.ProductService;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String hello(Model model) {

        model.addAttribute(
            "products",
            productService.getAllProducts()
        );

        model.addAttribute(
            "categories",
            categoryService.getAllCategories()
        );

        // model.addAttribute(
        //     "message",
        //     "XIN CHÀO TRƯỜNG ĐẠI HỌC CÔNG NGHỆ THÀNH PHỐ HỒ CHÍ MINH!"
        // );

        return "index";
    }
}