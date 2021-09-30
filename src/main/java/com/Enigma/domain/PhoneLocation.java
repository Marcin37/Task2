package com.Enigma.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PhoneLocation {
    @Id
    private long deviceId;
    @NotBlank
    @Size(min=0)
    private double latitude;
    @NotBlank
    @Size(min=0)
    private double longitude;
    public PhoneLocation(){}

    public PhoneLocation(long deviceId,double latitude, double longitude){
        this.deviceId=deviceId;
        this.latitude=latitude;
        this.longitude=longitude;
    }


    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }
}
