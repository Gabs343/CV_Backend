package com.miCVGabriel.mypackage.Service;

import com.miCVGabriel.mypackage.Model.Proyect;
import com.miCVGabriel.mypackage.Repository.ProyectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProyectService implements IProyectService{
    @Autowired
    private ProyectRepository proyectRepository;

    @Override
    public List<Proyect> getProyectsByUser(Integer userID){
        List<Proyect> proyectsByUser = new ArrayList<>();

        proyectRepository.findByUserID(userID).forEach(proyectsByUser::add);

        return proyectsByUser;
    }

    @Override
    public Proyect getProyectByID(Integer id){
        return proyectRepository.getById(id);
    }

    @Override
    public void saveProyect(Proyect p){ proyectRepository.save(p);}

    @Override
    public void deleteProyect(Integer id){ proyectRepository.deleteById(id);}

}
