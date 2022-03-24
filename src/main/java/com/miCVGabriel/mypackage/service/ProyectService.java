package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.Proyect;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.repository.ProyectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ProyectService implements IProyectService{
    @Autowired
    private ProyectRepository proyectRepository;

    @Override
    public Set<Proyect> getProyectsByUser(User userID){
        Set<Proyect> proyectsByUser = new HashSet<>();

        proyectRepository.findProyectsByUser(userID).forEach(proyectsByUser::add);

        return proyectsByUser;
    }

    @Override
    public Proyect getProyectByID(Integer id){ return proyectRepository.getById(id);}

    @Override
    public void saveProyect(Proyect p){ proyectRepository.save(p);}

    @Override
    public void deleteProyect(Integer id){ proyectRepository.deleteById(id);}

}
