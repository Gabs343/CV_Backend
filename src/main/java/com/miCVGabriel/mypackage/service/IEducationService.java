package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.Education;
import com.miCVGabriel.mypackage.model.User;

import java.util.Set;

public interface IEducationService {
    public Set<Education> getEducationsByUser(User userID);

    public Education getEducationByID(Long id);

    public void saveEducation(Education education);

    public void deleteEducation(Long id);
}
