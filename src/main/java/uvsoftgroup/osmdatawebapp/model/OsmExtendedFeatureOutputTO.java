package uvsoftgroup.osmdatawebapp.model;

import java.io.Serializable;

public class OsmExtendedFeatureOutputTO extends OsmBasicFeatureOutputTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	double osmPopulation, osmWidth;
	String osmTimestamp;
	

	public double getOsmWidth() {
		return osmWidth;
	}

	public void setOsmWidth(double osmWidth) {
		this.osmWidth = osmWidth;
	}

	public String getOsmTimestamp() {
		return osmTimestamp;
	}

	public void setOsmTimestamp(String osmTimestamp) {
		this.osmTimestamp = osmTimestamp;
	}

	public double getOsmPopulation() {
		return osmPopulation;
	}

	public void setOsmPopulation(double osmPopulation) {
		this.osmPopulation = osmPopulation;
	}
	

}
