package uvsoftgroup.osmdatawebapp.model;

import java.io.Serializable;

public class OsmExtendedFeatureInputTO extends OsmBasicFeatureInputTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	double osmPopulation;

	public double getOsmPopulation() {
		return osmPopulation;
	}

	public void setOsmPopulation(double osmPopulation) {
		this.osmPopulation = osmPopulation;
	}
	

}
