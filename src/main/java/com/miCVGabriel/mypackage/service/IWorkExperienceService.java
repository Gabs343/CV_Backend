package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.model.WorkExperience;

import java.util.Set;

public interface IWorkExperienceService {
    public Set<WorkExperience> getWorkExperiencesByUser(User userID);

    public WorkExperience getWorkExperienceByID(Integer id);

    public void saveWorkExperience(WorkExperience workExp);

    public void deleteWorkExperience(Integer id);
}
