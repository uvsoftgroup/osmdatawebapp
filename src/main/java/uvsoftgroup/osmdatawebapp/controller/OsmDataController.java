package uvsoftgroup.osmdatawebapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;

import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmExtendedFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureInputTO;
import uvsoftgroup.osmdatawebapp.service.OsmDataService;
import uvsoftgroup.osmdatawebapp.serviceimpl.OsmDataServiceImpl;

@Controller
public class OsmDataController {
	private static final Logger logger = LoggerFactory.getLogger(OsmDataServiceImpl.class);
	@Autowired
	private OsmDataService osmDataService;
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/osmroads", method = RequestMethod.GET)
	public String getOsmRoad(
			@RequestParam(value = "osmRoadFeatureInputTO", required = false) OsmRoadFeatureInputTO osmRoadFeatureInputTO,
			Model model) throws JsonProcessingException {
		if (osmRoadFeatureInputTO != null) {
			model.addAttribute("osmroads", osmDataService.getOsmRoad(osmRoadFeatureInputTO));
		} else {
			osmRoadFeatureInputTO = new OsmRoadFeatureInputTO();
			osmRoadFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmroads", osmDataService.getOsmRoad(osmRoadFeatureInputTO));
		}
		return "osmroads";
	}

	@RequestMapping(path = "/osmbuildings", method = RequestMethod.GET)
	public String getOsmBuilding(
			@RequestParam(value = "osmBasicFeatureInputTO", required = false) OsmBasicFeatureInputTO osmBasicFeatureInputTO,
			Model model) throws JsonProcessingException {

		if (osmBasicFeatureInputTO != null) {
			model.addAttribute("osmbuildings", osmDataService.getOsmBuilding(osmBasicFeatureInputTO));
			model.addAttribute("counter", osmDataService.getOsmBuilding(osmBasicFeatureInputTO).size());
		} else {
			osmBasicFeatureInputTO = new OsmBasicFeatureInputTO();
			osmBasicFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmbuildings", osmDataService.getOsmBuilding(osmBasicFeatureInputTO));
			model.addAttribute("counter", osmDataService.getOsmBuilding(osmBasicFeatureInputTO).size());
		}

		return "osmbuildings";
	}

	@RequestMapping(path = "/osmnatures", method = RequestMethod.GET)
	public String getOsmNature(
			@RequestParam(value = "osmBasicFeatureInputTO", required = false) OsmBasicFeatureInputTO osmBasicFeatureInputTO,
			Model model) throws JsonProcessingException {

		if (osmBasicFeatureInputTO != null) {
			model.addAttribute("osmnatures", osmDataService.getOsmNature(osmBasicFeatureInputTO));
		} else {
			osmBasicFeatureInputTO = new OsmBasicFeatureInputTO();
			osmBasicFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmnatures", osmDataService.getOsmNature(osmBasicFeatureInputTO));
		}

		return "osmnatures";
	}

	@RequestMapping(path = "/osmlanduses", method = RequestMethod.GET)
	public String getOsmLanduse(
			@RequestParam(value = "osmBasicFeatureInputTO", required = false) OsmBasicFeatureInputTO osmBasicFeatureInputTO,
			Model model) throws JsonProcessingException {
		if (osmBasicFeatureInputTO != null) {
			model.addAttribute("osmlanduses", osmDataService.getOsmLanduse(osmBasicFeatureInputTO));
		} else {
			osmBasicFeatureInputTO = new OsmBasicFeatureInputTO();
			osmBasicFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmlanduses", osmDataService.getOsmLanduse(osmBasicFeatureInputTO));
		}
		return "osmlanduses";
	}

	@RequestMapping(path = "/osmrailways", method = RequestMethod.GET)
	public String getOsmRailway(
			@RequestParam(value = "osmBasicFeatureInputTO", required = false) OsmBasicFeatureInputTO osmBasicFeatureInputTO,
			Model model) throws JsonProcessingException {
		if (osmBasicFeatureInputTO != null) {
			model.addAttribute("osmrailways", osmDataService.getOsmRailway(osmBasicFeatureInputTO));
		} else {
			osmBasicFeatureInputTO = new OsmBasicFeatureInputTO();
			osmBasicFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmrailways", osmDataService.getOsmRailway(osmBasicFeatureInputTO));
		}
		return "osmrailways";
	}

	@RequestMapping(path = "/osmpoints", method = RequestMethod.GET)
	public String getOsmPoint(
			@RequestParam(value = "osmExtendedFeatureInputTO", required = false) OsmExtendedFeatureInputTO osmExtendedFeatureInputTO,
			Model model) throws JsonProcessingException {

		if (osmExtendedFeatureInputTO != null) {
			model.addAttribute("osmpoints", osmDataService.getOsmPoint(osmExtendedFeatureInputTO));
		} else {
			osmExtendedFeatureInputTO = new OsmExtendedFeatureInputTO();
			osmExtendedFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmpoints", osmDataService.getOsmPoint(osmExtendedFeatureInputTO));
		}

		return "osmpoints";
	}

	@RequestMapping(path = "/osmwaterways", method = RequestMethod.GET)
	public String getOsmWaterway(
			@RequestParam(value = "osmExtendedFeatureInputTO", required = false) OsmExtendedFeatureInputTO osmExtendedFeatureInputTO,
			Model model) throws JsonProcessingException {
		if (osmExtendedFeatureInputTO != null) {
			model.addAttribute("osmwaterways", osmDataService.getOsmWaterway(osmExtendedFeatureInputTO));
		} else {
			osmExtendedFeatureInputTO = new OsmExtendedFeatureInputTO();
			osmExtendedFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmwaterways", osmDataService.getOsmWaterway(osmExtendedFeatureInputTO));
		}
		return "osmwaterways";
	}

	@RequestMapping(path = "/osmplaces", method = RequestMethod.GET)
	public String getOsmPlace(
			@RequestParam(value = "osmExtendedFeatureInputTO", required = false) OsmExtendedFeatureInputTO osmExtendedFeatureInputTO,
			Model model) throws JsonProcessingException {
		if (osmExtendedFeatureInputTO != null) {
			model.addAttribute("osmplaces", osmDataService.getOsmWaterway(osmExtendedFeatureInputTO));
		} else {
			osmExtendedFeatureInputTO = new OsmExtendedFeatureInputTO();
			osmExtendedFeatureInputTO.setSearchLimit(100);
			model.addAttribute("osmplaces", osmDataService.getOsmWaterway(osmExtendedFeatureInputTO));
		}
		return "osmplaces";
	}

}
