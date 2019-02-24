package uvsoftgroup.osmdatawebapp.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class OsmRoadFeatureOutputTO extends OsmBasicFeatureOutputTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String osmRef;
	int osmOneWay, osmBridge,osmTunnel;
	double osmMaxSpeed;
	public String getOsmRef() {
		return osmRef;
	}
	public void setOsmRef(String osmRef) {
		this.osmRef = osmRef;
	}
	public int getOsmOneWay() {
		return osmOneWay;
	}
	public void setOsmOneWay(int osmOneWay) {
		this.osmOneWay = osmOneWay;
	}
	public int getOsmBridge() {
		return osmBridge;
	}
	public void setOsmBridge(int osmBridge) {
		this.osmBridge = osmBridge;
	}
	public int getOsmTunnel() {
		return osmTunnel;
	}
	public void setOsmTunnel(int osmTunnel) {
		this.osmTunnel = osmTunnel;
	}
	public double getOsmMaxSpeed() {
		return osmMaxSpeed;
	}
	public void setOsmMaxSpeed(double osmMaxSpeed) {
		this.osmMaxSpeed = osmMaxSpeed;
	}
	
	  

}
