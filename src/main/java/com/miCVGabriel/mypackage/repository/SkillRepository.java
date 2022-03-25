package com.miCVGabriel.mypackage.repository;

import com.miCVGabriel.mypackage.model.Skill;
import com.miCVGabriel.mypackage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    public Set<Skill> findSkillsByUser(User user);
}
