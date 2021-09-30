package com.Enigma.service;

import com.Enigma.domain.PhoneLocation;
import com.Enigma.repository.PhoneLocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoLocalService {
    private final PhoneLocationRepository PHONE_LOCATION_REPOSITORY;

    public GeoLocalService(PhoneLocationRepository phoneLocationRepository){
        this.PHONE_LOCATION_REPOSITORY=phoneLocationRepository;
    }


    public List<PhoneLocation> getAllPhoneLocations(){
        return PHONE_LOCATION_REPOSITORY.findAll();
    }

    public PhoneLocation getPhoneLocationById(long deviceId) {
        return PHONE_LOCATION_REPOSITORY.getById(deviceId);

    }

    public void savePhoneLocation(PhoneLocation phoneLocation) {
        PHONE_LOCATION_REPOSITORY.save(phoneLocation);
    }
}
