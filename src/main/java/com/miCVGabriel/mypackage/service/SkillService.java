package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.Skill;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SkillService implements ISkillService{
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Set<Skill> getSkillsByUserID(User user) {
        Set<Skill> skillsByUser = new HashSet<>();

        skillRepository.findSkillsByUser(user).forEach(skillsByUser::add);

        return skillsByUser;
    }

    @Override
    public Skill getSkillByID(Long id) {
        return skillRepository.getById(id);
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
}
