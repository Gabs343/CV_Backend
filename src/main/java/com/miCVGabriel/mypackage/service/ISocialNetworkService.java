package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;

import java.util.Set;

public interface ISocialNetworkService {
    public Set<SocialNetwork> getSocialNetworksByUser(User u);

    public SocialNetwork getSocialNetworkByID(Integer id);

    public void saveSocialNetwork(SocialNetwork socialNet);

    public void deleteSocialNetwork(Integer id);
}
