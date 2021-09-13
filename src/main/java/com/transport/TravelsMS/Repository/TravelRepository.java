package com.transport.TravelsMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transport.TravelsMS.Entity.Travel;

public interface TravelRepository extends JpaRepository<Travel,Integer> {

	Travel findById(int busid);
}
