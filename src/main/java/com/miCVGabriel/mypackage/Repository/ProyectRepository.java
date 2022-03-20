package com.miCVGabriel.mypackage.Repository;

import com.miCVGabriel.mypackage.Model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Integer> {
    public List<Proyect> findByUserID(Integer userID);
}
