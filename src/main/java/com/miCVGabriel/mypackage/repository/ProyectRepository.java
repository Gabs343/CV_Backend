package com.miCVGabriel.mypackage.repository;

import com.miCVGabriel.mypackage.model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Integer> {
    public List<Proyect> findByUser(Integer userID);
}