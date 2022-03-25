package com.miCVGabriel.mypackage.repository;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface SocialNetworkRepository extends JpaRepository<SocialNetwork, Long> {
    public Set<SocialNetwork> findSocialNetworksByUser(User user);
}
