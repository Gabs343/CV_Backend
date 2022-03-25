package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.Education;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class EducationService implements IEducationService{
    @Autowired
    private EducationRepository educationRepository;

    @Override
    public Set<Education> getEducationsByUser(User userID) {
        Set<Education> educationsByUser = new HashSet<>();

        educationRepository.findEducationsByUser(userID).forEach(educationsByUser::add);

        return educationsByUser;
    }

    @Override
    public Education getEducationByID(Long id) {
        return educationRepository.getById(id);
    }

    @Override
    public void saveEducation(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);
    }
}
