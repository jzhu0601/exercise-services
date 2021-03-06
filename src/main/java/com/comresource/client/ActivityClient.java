package com.comresource.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.comresource.model.Activity;

public class ActivityClient {
	
	private Client client;
	
	public ActivityClient(){
		client = ClientBuilder.newClient();
	}
	
	public Activity get(String id){
		
		WebTarget target = client.target("http://localhost:8080/exercise-services/webapi/");
		Activity response = target.path("activites/" + id).request().get(Activity.class);
		return response;
		
	}
}
