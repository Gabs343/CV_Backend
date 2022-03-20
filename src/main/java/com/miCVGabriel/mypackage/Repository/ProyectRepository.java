package com.miCVGabriel.mypackage.Repository;

import com.miCVGabriel.mypackage.Model.Proyect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectRepository extends JpaRepository<Proyect, Integer> {
}
