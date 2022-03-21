package com.miCVGabriel.mypackage.Service;

import com.miCVGabriel.mypackage.Model.Proyect;

import java.util.List;

public interface IProyectService {
    public List<Proyect> getProyectsByUser(Integer userID);

    public Proyect getProyectByID(Integer id);

    public  void saveProyect(Proyect p);

    public void deleteProyect(Integer id);
}
