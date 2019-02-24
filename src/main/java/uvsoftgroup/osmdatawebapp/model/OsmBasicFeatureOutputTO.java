package uvsoftgroup.osmdatawebapp.model;

import java.io.Serializable;

public class OsmBasicFeatureOutputTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	long osmGId;
	String osmId,osmName,osmType,osmGeom;
	
	
	public long getOsmGId() {
		return osmGId;
	}
	public void setOsmGId(long osmGId) {
		this.osmGId = osmGId;
	}
	public String getOsmId() {
		return osmId;
	}
	public void setOsmId(String osmId) {
		this.osmId = osmId;
	}
	public String getOsmName() {
		return osmName;
	}
	public void setOsmName(String osmName) {
		this.osmName = osmName;
	}
	public String getOsmType() {
		return osmType;
	}
	public void setOsmType(String osmType) {
		this.osmType = osmType;
	}
	public String getOsmGeom() {
		return osmGeom;
	}
	public void setOsmGeom(String osmGeom) {
		this.osmGeom = osmGeom;
	}
	
}
