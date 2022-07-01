package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/save")
    public String SaveGET() {
        return "alumnos/index";
    }

    @PostMapping("/save")
    // public String SavePOST(ModelMap modelMap, @RequestParam(name = "apePat", required = false, defaultValue = "Sin apellido") String Apaterno, @RequestParam(name = "apeMat") String AMaterno, @RequestParam(name = "nombre") String Nombre) {
    public String SavePOST(ModelMap modelMap, @RequestParam String apePat, @RequestParam String apeMat, @RequestParam String nombre) {
        // String FullName = Apaterno + " " + AMaterno + " " + Nombre;
        String FullName = apePat + " " + apeMat + " " + nombre;
        modelMap.addAttribute("FullName", FullName);
        return "alumnos/index";
    }

}
