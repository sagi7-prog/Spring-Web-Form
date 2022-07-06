package com.controller;

import com.dto.AlumnoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/save")
    public String SaveGET() {
        return "alumnos/index";
    }

    @PostMapping("/save")
    // public String SavePOST(ModelMap modelMap, @RequestParam(name = "apePat", required = false, defaultValue = "Sin apellido") String Apaterno, @RequestParam(name = "apeMat") String AMaterno, @RequestParam(name = "nombre") String Nombre) {
    // public String SavePOST(ModelMap modelMap, @RequestParam String apePat, @RequestParam String apeMat, @RequestParam String nombre) {
    // public String SavePOST(ModelMap modelMap, @ModelAttribute("Datos") AlumnoDto alumnoDto) {
        public String SavePOST(ModelMap modelMap, AlumnoDto alumnoDto) {
        // String FullName = Apaterno + " " + AMaterno + " " + Nombre;
        String DesGenero = alumnoDto.getIdGene() == 1 ? "Masculino" : "Femenino";
        String FullName = alumnoDto.getApePat() + " " + alumnoDto.getApeMat() + " " + alumnoDto.getNombre() + " " + alumnoDto.getDesEma() + " " + DesGenero;
        modelMap.addAttribute("FullName", FullName);
        return "alumnos/index";
    }

}
