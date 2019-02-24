package uvsoftgroup.osmdatawebapp.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.service.OsmDataService;

@Service
public class OsmDataServiceImpl implements OsmDataService {
	private static final Logger logger = LoggerFactory.getLogger(OsmDataServiceImpl.class);
	@Autowired
	private RestTemplate restTemplate;
	@Value("${resfulapi.base.url}")
	String baseUrl;
	
	/* (non-Javadoc)
	 * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmRoad(uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureInputTO)
	 */
	public List<OsmRoadFeatureOutputTO> getOsmRoad(OsmRoadFeatureInputTO osmRoadFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmRoad()-----------------");
		String uriVariables =getJsonStringFromObject(osmRoadFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmroads?osmRoadFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmroads?osmRoadFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmRoadFeatureOutputTO[] osmRoadFeatureOutputTOs = restTemplate.getForObject(url,
				OsmRoadFeatureOutputTO[].class, uriVariables);
		List<OsmRoadFeatureOutputTO> list = Arrays.asList(osmRoadFeatureOutputTOs);

		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmRoadFeatureOutputTO>(list);
		}

	}
    /*
     * (non-Javadoc)
     * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmNature(uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO)
     */
	public List<OsmBasicFeatureOutputTO> getOsmNature(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmNature()-----------------");
		String uriVariables =getJsonStringFromObject(osmBasicFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmnatures?osmBasicFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmnatures?osmBasicFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmBasicFeatureOutputTO[] osmBasicFeatureOutputTOs = restTemplate.getForObject(url,
				OsmBasicFeatureOutputTO[].class, uriVariables);
		
		List<OsmBasicFeatureOutputTO> list = Arrays.asList(osmBasicFeatureOutputTOs);
		
		logger.info(String.format("Records:%s", list.size()));
		
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}

	}
	/*
	 * (non-Javadoc)
	 * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmBuilding(uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO)
	 */
	public List<OsmBasicFeatureOutputTO> getOsmBuilding(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmBuilding()-----------------");
		String uriVariables =getJsonStringFromObject(osmBasicFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmbuildings?osmBasicFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmbuildings?osmBasicFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmBasicFeatureOutputTO[] osmBasicFeatureOutputTOs = restTemplate.getForObject(url,
				OsmBasicFeatureOutputTO[].class, uriVariables);
		
		List<OsmBasicFeatureOutputTO> list = Arrays.asList(osmBasicFeatureOutputTOs);
		
		logger.info(String.format("Records:%s", list.size()));
		
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}

	}
    /*
     * (non-Javadoc)
     * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmRailway(uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO)
     */
	public List<OsmBasicFeatureOutputTO> getOsmRailway(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmRailway()-----------------");
		String uriVariables =getJsonStringFromObject(osmBasicFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmrailways?osmBasicFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmrailways?osmBasicFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmBasicFeatureOutputTO[] osmBasicFeatureOutputTOs = restTemplate.getForObject(url,
				OsmBasicFeatureOutputTO[].class, uriVariables);
		List<OsmBasicFeatureOutputTO> list = Arrays.asList(osmBasicFeatureOutputTOs);
		logger.info(String.format("Records:%s", list.size()));
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}

	}
    /*
     * (non-Javadoc)
     * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmLanduse(uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO)
     */
	public List<OsmBasicFeatureOutputTO> getOsmLanduse(OsmBasicFeatureInputTO osmBasicFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmLanduse()-----------------");
		String uriVariables =getJsonStringFromObject(osmBasicFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmlanduses?osmBasicFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmlanduses?osmBasicFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmBasicFeatureOutputTO[] osmBasicFeatureOutputTOs = restTemplate.getForObject(url,
				OsmBasicFeatureOutputTO[].class, uriVariables);
		List<OsmBasicFeatureOutputTO> list = Arrays.asList(osmBasicFeatureOutputTOs);
		logger.info(String.format("Records:%s", list.size()));
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmBasicFeatureOutputTO>(list);
		}

	}
	
	/*
	 * (non-Javadoc)
	 * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmPoint(uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureInputTO)
	 */

	public List<OsmExtendedFeatureOutputTO> getOsmPoint(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmPoint()-----------------");
		String uriVariables =getJsonStringFromObject(osmExtendedFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmpoints?osmExtendedFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmpoints?osmExtendedFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmExtendedFeatureOutputTO[] osmExtendedFeatureOutputTOs = restTemplate.getForObject(url,
				OsmExtendedFeatureOutputTO[].class, uriVariables);
		List<OsmExtendedFeatureOutputTO> list = Arrays.asList(osmExtendedFeatureOutputTOs);
		logger.info(String.format("Records:%s", list.size()));
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}

	}
   /*
    * (non-Javadoc)
    * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmWaterway(uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureInputTO)
    */
	public List<OsmExtendedFeatureOutputTO> getOsmWaterway(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmWaterway()-----------------");
		String uriVariables =getJsonStringFromObject(osmExtendedFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmwaterways?osmExtendedFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmwaterways?osmExtendedFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmExtendedFeatureOutputTO[] osmExtendedFeatureOutputTOs = restTemplate.getForObject(url,
				OsmExtendedFeatureOutputTO[].class, uriVariables);
		List<OsmExtendedFeatureOutputTO> list = Arrays.asList(osmExtendedFeatureOutputTOs);
		logger.info(String.format("Records:%s", list.size()));
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}

	}
  /*
   * (non-Javadoc)
   * @see uvsoftgroup.osmdatawebapp.service.OsmDataService#getOsmPlace(uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureInputTO)
   */
	public List<OsmExtendedFeatureOutputTO> getOsmPlace(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO)
			throws JsonProcessingException {
		logger.info("----------getOsmPlace()-----------------");
		String uriVariables =getJsonStringFromObject(osmExtendedFeatureInputTO);
		String url;

		if (uriVariables != null) {
			url = baseUrl + "osmplaces?osmExtendedFeatureInputTO=" + uriVariables;
		} else {
			url = baseUrl + "osmplaces?osmExtendedFeatureInputTO={\"searchLimit\": 1000}";
		}
		logger.info(String.format("Request ULR:%s", url));

		OsmExtendedFeatureOutputTO[] osmExtendedFeatureOutputTOs = restTemplate.getForObject(url,
				OsmExtendedFeatureOutputTO[].class, uriVariables);
		List<OsmExtendedFeatureOutputTO> list = Arrays.asList(osmExtendedFeatureOutputTOs);
		logger.info(String.format("Records:%s", list.size()));
		if (list.size() > 0 && !list.isEmpty()) {
			return list;
		} else {
			return new ArrayList<OsmExtendedFeatureOutputTO>(list);
		}

	}
	
	private String getJsonStringFromObject(OsmBasicFeatureInputTO osmBasicFeatureInputTO) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		String uriVariables = mapper.writeValueAsString(osmBasicFeatureInputTO);
		return uriVariables;
	}
	
	
	private String getJsonStringFromObject(OsmExtendedFeatureInputTO osmExtendedFeatureInputTO) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		String uriVariables = mapper.writeValueAsString(osmExtendedFeatureInputTO);
		return uriVariables;
	}
	
	private String getJsonStringFromObject(OsmRoadFeatureInputTO osmRoadFeatureInputTO) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		String uriVariables = mapper.writeValueAsString(osmRoadFeatureInputTO);
		return uriVariables;
	}
	
	
}
