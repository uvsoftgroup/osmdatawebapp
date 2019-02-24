package uvsoftgroup.osmdatawebapp.model;

import java.io.Serializable;

public class OsmBasicFeatureInputTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long osmGId;
	String osmId,osmName,osmType,osmGeom;
	long searchLimit,searchOffsetValue;
	
	public Long getOsmGId() {
		return osmGId;
	}
	public void setOsmGId(Long osmGId) {
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
	public long getSearchLimit() {
		return searchLimit;
	}
	public void setSearchLimit(long searchLimit) {
		this.searchLimit = searchLimit;
	}
	public long getSearchOffsetValue() {
		return searchOffsetValue;
	}
	public void setSearchOffsetValue(long searchOffsetValue) {
		this.searchOffsetValue = searchOffsetValue;
	}
	
}
