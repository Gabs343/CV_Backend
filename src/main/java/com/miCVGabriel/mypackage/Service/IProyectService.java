package com.miCVGabriel.mypackage.Service;

import com.miCVGabriel.mypackage.Model.Proyect;

import java.util.List;

public interface IProyectService {
    public List<Proyect> getProyectsByUser(Integer userID);

    public  void saveProyect(Proyect p);

    public void deleteProyect(Integer id);
}
