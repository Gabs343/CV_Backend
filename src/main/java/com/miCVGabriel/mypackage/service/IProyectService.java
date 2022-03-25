package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.Proyect;
import com.miCVGabriel.mypackage.model.User;

import java.util.Set;

public interface IProyectService {
    public Set<Proyect> getProyectsByUser(User userID);

    public Proyect getProyectByID(Long id);

    public  void saveProyect(Proyect p);

    public void deleteProyect(Long id);
}
