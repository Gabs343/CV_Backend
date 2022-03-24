package com.miCVGabriel.mypackage.controller;

import com.miCVGabriel.mypackage.model.SocialNetwork;
import com.miCVGabriel.mypackage.model.User;
import com.miCVGabriel.mypackage.service.ISocialNetworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class SocialNetworkController {
    @Autowired
    private ISocialNetworkService iSocialNetService;

    @GetMapping("/socialNetworksByUser/{userID}")
    public Set<SocialNetwork> findSocialNetworksByUser(@PathVariable User userID){
        return iSocialNetService.getSocialNetworksByUser(userID);
    }

    @PostMapping("/socialNetworks")
    public String createSocialNetwork(@RequestBody SocialNetwork socialNet){
        iSocialNetService.saveSocialNetwork(socialNet);
        return "social network saved";
    }

    @PutMapping("/socialNetworks/{id}")
    public SocialNetwork editSocialNetwork(@PathVariable Integer id, @RequestBody SocialNetwork socialNet){
        SocialNetwork editedSocialNet = iSocialNetService.getSocialNetworkByID(id);

        editedSocialNet.setName(socialNet.getName());
        editedSocialNet.setLink(socialNet.getLink());
        editedSocialNet.setImg(socialNet.getImg());
        editedSocialNet.setUser(socialNet.getUser());

        iSocialNetService.saveSocialNetwork(editedSocialNet);

        return editedSocialNet;
    }

    @DeleteMapping("/socialNetworks/{id}")
    public String deleteSocialNetwork(@PathVariable Integer id){
        iSocialNetService.deleteSocialNetwork(id);
        return "social network deleted";
    }
}
