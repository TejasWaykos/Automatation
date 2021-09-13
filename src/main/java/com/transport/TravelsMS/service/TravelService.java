package com.transport.TravelsMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.transport.TravelsMS.DTO.BusDTO;
import com.transport.TravelsMS.DTO.TravelDTO;
import com.transport.TravelsMS.Entity.Travel;
import com.transport.TravelsMS.Repository.TravelRepository;

@Service
public class TravelService {

	@Autowired
	TravelRepository travelRepository;
	
	public List<Travel> getInfo() {
		return travelRepository.findAll();
	}
	
	public TravelDTO getSpecificInfo(int busid) {
		Travel travel=travelRepository.findById(busid);
		
		TravelDTO travelDTO=TravelDTO.valueOf(travel);
		
		BusDTO busDTO=new RestTemplate().getForObject("http://localhost:5200/start/"+travelDTO.getBusid(), BusDTO.class);
		
		travelDTO.setBusDTO(busDTO);
		
		return travelDTO;
	}
}
