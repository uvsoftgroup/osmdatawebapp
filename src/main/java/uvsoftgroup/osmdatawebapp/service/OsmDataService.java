package uvsoftgroup.osmdatawebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureOutputTO;

@Service
public interface OsmDataService {
	public List<OsmRoadFeatureOutputTO> getOsmRoad(OsmRoadFeatureInputTO osmRoadFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmBasicFeatureOutputTO> getOsmBuilding(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmBasicFeatureOutputTO> getOsmLanduse(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmBasicFeatureOutputTO> getOsmRailway(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmBasicFeatureOutputTO> getOsmNature(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmExtendedFeatureOutputTO> getOsmPoint(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmExtendedFeatureOutputTO> getOsmWaterway(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws JsonProcessingException;

	public List<OsmExtendedFeatureOutputTO> getOsmPlace(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws JsonProcessingException;
}
