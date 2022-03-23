package com.miCVGabriel.mypackage.repository;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Integer> {
    public List<SocialNetwork> findSocialNetworkByUser(User user);
}
