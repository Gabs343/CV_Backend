package com.miCVGabriel.mypackage.controller;

import com.miCVGabriel.mypackage.model.Proyect;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.service.IProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProyectController {
    @Autowired
    private IProyectService iProyectService;

    @GetMapping("/proyectsByUser/{userID}")
    public List<Proyect> findProyectsByUser(@PathVariable User userID){
        return iProyectService.getProyectsByUser(userID);
    }

    @PostMapping("/proyects")
    public String createProyect(@RequestBody Proyect p){
        iProyectService.saveProyect(p);
        return "proyect saved";
    }

    @PutMapping("/proyects/{id}")
    public Proyect editProyect(@PathVariable Integer id, @RequestBody Proyect p){
        Proyect editedProyect = iProyectService.getProyectByID(id);

        editedProyect.setImg(p.getImg());
        editedProyect.setName(p.getName());
        editedProyect.setFinished(p.getFinished());
        editedProyect.setLink(p.getLink());
        editedProyect.setDescription(p.getDescription());
        editedProyect.setUser(p.getUser());

        iProyectService.saveProyect(editedProyect);

        return editedProyect;
    }

    @DeleteMapping("/proyects/{id}")
    public String deleteProyect(@PathVariable Integer id){
        iProyectService.deleteProyect(id);
        return "proyect deleted";
    }
}
