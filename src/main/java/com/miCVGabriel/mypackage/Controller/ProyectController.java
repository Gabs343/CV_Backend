package com.miCVGabriel.mypackage.Controller;

import com.miCVGabriel.mypackage.Model.Proyect;
import com.miCVGabriel.mypackage.Service.IProyectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProyectController {
    @Autowired
    private IProyectService iProyectService;

    @GetMapping("/proyectsByUser/{userID}")
    public List<Proyect> findProyectsByUser(@PathVariable Integer userID){
        return iProyectService.getProyectsByUser(userID);
    }

    @PostMapping("/proyect/create")
    public String createProyect(@RequestBody Proyect p){
        iProyectService.saveProyect(p);
        return "proyect saved";
    }

    @PutMapping("/proyect/edit/{id}")
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

    @DeleteMapping("/proyect/delete/{id}")
    public String deleteProyect(@PathVariable Integer id){
        iProyectService.deleteProyect(id);
        return "proyect deleted";
    }
}
