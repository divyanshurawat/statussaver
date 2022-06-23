package com.status.saver.controller;

import com.status.saver.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    private final ServiceLayer serviceLayer;
@Autowired
    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }

    @GetMapping("/")
    public  String getData(){
      return  serviceLayer.consumerAPI();
    }
}
