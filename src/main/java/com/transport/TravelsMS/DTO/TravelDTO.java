package com.transport.TravelsMS.DTO;

import org.springframework.beans.factory.annotation.Autowired;

import com.transport.TravelsMS.Entity.Travel;

public class TravelDTO {
	private int busid;
	
	private String source;
	
	private String destination;

	private String busAvailable;
	
	BusDTO busDTO;

	public BusDTO getBusDTO() {
		return busDTO;
	}

	public void setBusDTO(BusDTO busDTO) {
		this.busDTO = busDTO;
	}

	public int getBusid() {
		return busid;
	}

	public void setBusid(int busid) {
		this.busid = busid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBusAvailable() {
		return busAvailable;
	}

	public void setBusAvailable(String busAvailable) {
		this.busAvailable = busAvailable;
	}
	public static TravelDTO valueOf(Travel travel) {
		
		TravelDTO travelDTO=new TravelDTO();
		travelDTO.setBusid(travel.getBusid());
		travelDTO.setSource(travel.getSource());
		travelDTO.setDestination(travel.getDestination());
		travelDTO.setBusAvailable(travel.getBusAvailable());
		
		return travelDTO;
	}
	
	public Travel createEntity() {
		Travel tr=new Travel();
		tr.setBusid(this.getBusid());
		tr.setSource(this.getSource());
		tr.setDestination(this.getDestination());
		this.setBusAvailable(this.getBusAvailable());
		
		return tr;
	}
}
