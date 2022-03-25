package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.Skill;
import com.miCVGabriel.mypackage.model.User;

import java.util.Set;

public interface ISkillService {
    public Set<Skill> getSkillsByUserID(User user);

    public Skill getSkillByID(Long id);

    public void saveSkill(Skill skill);

    public void deleteSkill(Long id);
}
