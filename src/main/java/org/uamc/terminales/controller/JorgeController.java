package org.uamc.terminales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class JorgeController {

    @GetMapping("/jorge")
    public String jorge() {
        return "Hola desde JorgeController";
    }
}
