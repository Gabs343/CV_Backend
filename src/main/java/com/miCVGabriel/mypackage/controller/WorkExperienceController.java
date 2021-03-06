package com.miCVGabriel.mypackage.controller;

import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.model.WorkExperience;
import com.miCVGabriel.mypackage.service.IWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class WorkExperienceController {
    @Autowired
    private IWorkExperienceService iWorkExpService;

    @GetMapping("/workExperiencesByUser/{userID}")
    public Set<WorkExperience> findWorkExperiencesByUser(@PathVariable User userID){
        return iWorkExpService.getWorkExperiencesByUser(userID);
    }

    @PostMapping("/workExperiences")
    public String createWorkExperiences(@RequestBody WorkExperience workExp){
        iWorkExpService.saveWorkExperience(workExp);
        return "work experience saved";
    }

    @PutMapping("/workExperiences/{id}")
    public WorkExperience editWorkExperience(@PathVariable Long id, @RequestBody WorkExperience workExp){
        WorkExperience editedWorkExp = iWorkExpService.getWorkExperienceByID(id);

        editedWorkExp.setChargeName(workExp.getChargeName());
        editedWorkExp.setCompany(workExp.getCompany());
        editedWorkExp.setImg(workExp.getImg());
        editedWorkExp.setEntry(workExp.getEntry());
        editedWorkExp.setWayOut(workExp.getWayOut());
        editedWorkExp.setPresentDay(workExp.getPresentDay());
        editedWorkExp.setDescription(workExp.getDescription());
        editedWorkExp.setUser(workExp.getUser());

        return editedWorkExp;
    }

    @DeleteMapping("/workExperiences/{id}")
    public String deleteWorkExperience(@PathVariable Long id){
        iWorkExpService.deleteWorkExperience(id);
        return "work experience deleted";
    }
}
