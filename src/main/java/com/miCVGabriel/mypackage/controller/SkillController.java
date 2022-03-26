package com.miCVGabriel.mypackage.controller;

import com.miCVGabriel.mypackage.model.Skill;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.service.ISkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class SkillController {
    @Autowired
    private ISkillService iSkillService;

    @GetMapping("/findSkillsByUserID/{userID}")
    public Set<Skill> findSkillsByUser(@PathVariable User userID){
        return iSkillService.getSkillsByUserID(userID);
    }

    @PostMapping("/skills")
    public String createSkill(@RequestBody Skill skill){
        iSkillService.saveSkill(skill);
        return "Skill saved";
    }

    @PutMapping("/skills/{id}")
    public Skill editSkill(@PathVariable Long id, @RequestBody Skill skill){
        Skill editedSkill = iSkillService.getSkillByID(id);

        editedSkill.setName(skill.getName());
        editedSkill.setPercent(skill.getPercent());
        editedSkill.setUser(skill.getUser());

        iSkillService.saveSkill(editedSkill);

        return editedSkill;
    }

    @DeleteMapping("/skills/{id}")
    public String deleteSkills(@PathVariable Long id){
        iSkillService.deleteSkill(id);
        return "Skill deleted";
    }
}
