package com.miCVGabriel.mypackage.controller;

import com.miCVGabriel.mypackage.model.Education;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class EducationController {
    @Autowired
    private IEducationService iEducationService;

    @GetMapping("/educationsByUser/{userID}")
    public Set<Education> findEducationsByUser(@PathVariable User userID){
        return iEducationService.getEducationsByUser(userID);
    }

    @PostMapping("/educations")
    public String createEducation(@RequestBody Education education){
        iEducationService.saveEducation(education);
        return "education saved";
    }

    @PutMapping("/educations/{id}")
    public Education editedEducation(@PathVariable Long id, @RequestBody Education education){
        Education editedEducation = iEducationService.getEducationByID(id);

        editedEducation.setTitle(education.getTitle());
        editedEducation.setInstitution(education.getInstitution());
        editedEducation.setImg(education.getImg());
        editedEducation.setEntry(education.getEntry());
        editedEducation.setWayOut(education.getWayOut());
        editedEducation.setPresentDay(education.getPresentDay());
        editedEducation.setFinished(education.getFinished());
        editedEducation.setDescription(education.getDescription());
        editedEducation.setUser(education.getUser());

        iEducationService.saveEducation(editedEducation);

        return editedEducation;
    }

    @DeleteMapping("/educations/{id}")
    public String deleteEducation(@PathVariable Long id){
        iEducationService.deleteEducation(id);
        return "education deleted";
    }
}
