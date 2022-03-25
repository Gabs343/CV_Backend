package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.repository.SocialNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SocialNetworkService implements ISocialNetworkService{
    @Autowired
    private SocialNetworkRepository socialNetworkRepository;

    @Override
    public Set<SocialNetwork> getSocialNetworksByUser(User u){
        Set<SocialNetwork> socialNetworksByUser = new HashSet<>();

        socialNetworkRepository.findSocialNetworksByUser(u).forEach(socialNetworksByUser::add);

        return socialNetworksByUser;
    }

    @Override
    public SocialNetwork getSocialNetworkByID(Long id){
        return socialNetworkRepository.getById(id);
    }

    @Override
    public void saveSocialNetwork(SocialNetwork socialNet){
        socialNetworkRepository.save(socialNet);
    }

    @Override
    public void deleteSocialNetwork(Long id){
        socialNetworkRepository.deleteById(id);
    }
}
