package com.comresource.view;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.comresource.model.Activity;
import com.comresource.repository.ActivityRepository;
import com.comresource.repository.ActivityRepositoryStub;


@Path("activities") //http://localhost:8080/exercise-services/webapi/activities
public class ActivityResource {

	private ActivityRepository activityRepository = new ActivityRepositoryStub();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Activity> getAllActivities(){
		return activityRepository.findAllActivities();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{activityId}")  //localhost:8080/exercise-services/webapi/activities/1234
	public Activity getActity(@PathParam ("activityId") String activityId){
		return activityRepository.findActivity(activityId);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Path("{activityId}/user")  //localhost:8080/exercise-services/webapi/activities/1234/user 
	public Activity getActityUser(@PathParam ("activityId") String activityId){
		return activityRepository.findActivity(activityId);
	}
	
	
	
	
	
	
	
}
