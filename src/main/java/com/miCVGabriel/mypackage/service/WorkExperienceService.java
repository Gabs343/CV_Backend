package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.model.WorkExperience;
import com.miCVGabriel.mypackage.repository.WorkExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class WorkExperienceService implements IWorkExperienceService {
    @Autowired
    private WorkExperienceRepository workExpRepository;

    @Override
    public Set<WorkExperience> getWorkExperiencesByUser(User userID){
        Set<WorkExperience> workExpsByUser = new HashSet<>();

        workExpRepository.findWorkExperiencesByUser(userID).forEach(workExpsByUser::add);

        return workExpsByUser;
    }

    @Override
    public WorkExperience getWorkExperienceByID(Long id){
       return  workExpRepository.getById(id);
    }

    @Override
    public void saveWorkExperience(WorkExperience workExp){
        workExpRepository.save(workExp);
    }

    @Override
    public void deleteWorkExperience(Long id){
        workExpRepository.deleteById(id);
    }
}
