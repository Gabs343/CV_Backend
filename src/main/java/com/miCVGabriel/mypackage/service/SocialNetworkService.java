package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.repository.SocialNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SocialNetworkService implements ISocialNetworkService{
    @Autowired
    private SocialNetworkRepository socialNetworkRepository;

    @Override
    public List<SocialNetwork> getSocialNetworksByUser(User u){
        List<SocialNetwork> socialNetworksByUser = new ArrayList<>();

        socialNetworkRepository.findSocialNetworkByUser(u).forEach(socialNetworksByUser::add);

        return socialNetworksByUser;
    }

    @Override
    public SocialNetwork getSocialNetworkByID(Integer id){
        return socialNetworkRepository.getById(id);
    }

    @Override
    public void saveSocialNetwork(SocialNetwork socialNet){
        socialNetworkRepository.save(socialNet);
    }

    @Override
    public void deleteSocialNetwork(Integer id){
        socialNetworkRepository.deleteById(id);
    }
}
