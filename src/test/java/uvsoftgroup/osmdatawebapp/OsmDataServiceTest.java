package uvsoftgroup.osmdatawebapp;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;

import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmBasicFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureInputTO;
import uvsoftgroup.osmdatawebapp.model.OsmRoadFeatureOutputTO;
import uvsoftgroup.osmdatawebapp.service.OsmDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OsmDataServiceTest {
	
@Autowired
private OsmDataService osmDataService;
	
	@Test
	@Ignore
	public void osmRoadTestSuite() throws JsonProcessingException {
		OsmRoadFeatureInputTO osmRoadFeatureInputTO=new OsmRoadFeatureInputTO();
		osmRoadFeatureInputTO.setSearchLimit(1000);
		osmRoadTestCase(osmRoadFeatureInputTO);
	}
	public void osmRoadTestCase(OsmRoadFeatureInputTO osmRoadFeatureInputTO) throws JsonProcessingException {
		
		List<OsmRoadFeatureOutputTO> list=osmDataService.getOsmRoad(osmRoadFeatureInputTO);
		list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
				+ "getOsmType():%s,getOsmMaxSpeed():%S,getOsmGeom():%s", 
				s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
				s.getOsmMaxSpeed(),s.getOsmGeom())));		
	}
	
	
	@Test
	@Ignore
	public void osmBuildingTestSuite() throws JsonProcessingException {
		OsmBasicFeatureInputTO osmBasicFeatureInputTO=new OsmBasicFeatureInputTO();
		osmBasicFeatureInputTO.setSearchLimit(10);
		
		OsmBasicFeatureInputTO osmBasicFeatureInputTO1=new OsmBasicFeatureInputTO();
		osmBasicFeatureInputTO1.setSearchLimit(10);
		osmBasicFeatureInputTO1.setOsmType("school");
		
		OsmBasicFeatureInputTO osmBasicFeatureInputTO2=new OsmBasicFeatureInputTO();
		osmBasicFeatureInputTO2.setSearchLimit(10);
		osmBasicFeatureInputTO2.setOsmName("school");
		osmBasicFeatureInputTO2.setOsmType("school");
		
		osmBuildingTestCase(osmBasicFeatureInputTO);
		osmBuildingTestCase(osmBasicFeatureInputTO1);
		osmBuildingTestCase(osmBasicFeatureInputTO2);
	}
	public void osmBuildingTestCase(OsmBasicFeatureInputTO osmBasicFeatureInputTO) throws JsonProcessingException {
		
		List<OsmBasicFeatureOutputTO> list=osmDataService.getOsmBuilding(osmBasicFeatureInputTO);
		list.forEach(s->System.out.println(String.format("getgId():%s,getOsmId():%s,getOsmName():%s,"
				+ "getOsmType():%s,getOsmGeom():%s", 
				s.getOsmGId(),s.getOsmId(), s.getOsmName(), s.getOsmType(),
				s.getOsmGeom())));		
	}
	
}
