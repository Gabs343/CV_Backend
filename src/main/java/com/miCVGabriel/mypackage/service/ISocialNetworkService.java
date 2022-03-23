package com.miCVGabriel.mypackage.service;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;

import java.util.List;

public interface ISocialNetworkService {
    public List<SocialNetwork> getSocialNetworksByUser(User u);

    public SocialNetwork getSocialNetworkByID(Integer id);

    public void saveSocialNetwork(SocialNetwork socialNet);

    public void deleteSocialNetwork(Integer id);
}
