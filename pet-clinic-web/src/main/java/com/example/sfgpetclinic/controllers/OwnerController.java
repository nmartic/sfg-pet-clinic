package com.example.sfgpetclinic.controllers;

import com.example.sfgpetclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    // constructor dependency injection
    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index.html";
    }

    @RequestMapping("/find")
    public String findOwners() {
        return "notimplemented";
    }

}
