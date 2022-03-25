package com.miCVGabriel.mypackage.repository;

import com.miCVGabriel.mypackage.model.Education;
import com.miCVGabriel.mypackage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface EducationRepository extends JpaRepository<Education, Long> {
    public Set<Education> findEducationsByUser(User user);
}
