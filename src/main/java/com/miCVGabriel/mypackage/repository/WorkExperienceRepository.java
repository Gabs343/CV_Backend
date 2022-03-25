package com.miCVGabriel.mypackage.repository;

import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.model.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Long> {
    public Set<WorkExperience> findWorkExperiencesByUser(User user);
}
