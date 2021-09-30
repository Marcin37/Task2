package com.Enigma.repository;

import com.Enigma.domain.PhoneLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PhoneLocationRepository extends JpaRepository<PhoneLocation,Long> {
}
