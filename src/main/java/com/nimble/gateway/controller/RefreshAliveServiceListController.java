package com.nimble.gateway.controller;

import com.netflix.discovery.DiscoveryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshAliveServiceListController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/offline")
    public void offline(){
        DiscoveryManager.getInstance().shutdownComponent();
    }

}
