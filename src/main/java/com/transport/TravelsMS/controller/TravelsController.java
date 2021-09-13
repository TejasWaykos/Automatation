package com.transport.TravelsMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.transport.TravelsMS.DTO.TravelDTO;
import com.transport.TravelsMS.Entity.Travel;
import com.transport.TravelsMS.service.TravelService;

@RestController
public class TravelsController {

	@Autowired
	private TravelService travelService;

	@GetMapping("/start")
	public List<Travel> getInfo() {
		return travelService.getInfo();
	}

	@GetMapping("/start/{busid}")
	public TravelDTO getSpecificInfo(@PathVariable int busid) throws Exception {
		return travelService.getSpecificInfo(busid);
		
	}

}
