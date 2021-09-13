package com.transport.TravelsMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="travel")
public class Travel {

	@Id
	@Column(name="bus_id")
	private int busid;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="bus_Avai")
	private String busAvailable;
	
	public Travel() {
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

	public Travel(int busid, String source, String destination, String busAvailable) {
		this.busid = busid;
		this.source = source;
		this.destination = destination;
		this.busAvailable = busAvailable;
	}

	@Override
	public String toString() {
		return "Travel [busid=" + busid + ", source=" + source + ", destination=" + destination + ", busAvailable="
				+ busAvailable + "]";
	}


	
	
}
