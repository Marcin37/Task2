package com.Enigma.controller;


import com.Enigma.domain.PhoneLocation;
import com.Enigma.service.GeoLocalService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class GeoLocalController {
    private final GeoLocalService GEO_LOCAL_SERVICE;

    public GeoLocalController(GeoLocalService geoLocalService){
        this.GEO_LOCAL_SERVICE=geoLocalService;
    }


    @GetMapping("/allLocations")
    public List<PhoneLocation> getAllPhoneLocations(){
        return GEO_LOCAL_SERVICE.getAllPhoneLocations();
    }

    @GetMapping("/{deviceId}")
    public PhoneLocation getPhoneLocationById(@PathVariable("deviceId") long deviceId){
        return  GEO_LOCAL_SERVICE.getPhoneLocationById(deviceId);
    }

    @PostMapping("/save")
    public String savePhoneLocation(@RequestBody PhoneLocation phoneLocation){
        GEO_LOCAL_SERVICE.savePhoneLocation(phoneLocation);
        return "Success";
    }


}
