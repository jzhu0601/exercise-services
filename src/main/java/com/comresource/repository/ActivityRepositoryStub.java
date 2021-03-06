package com.comresource.repository;

import java.util.ArrayList;
import java.util.List;

import com.comresource.model.Activity;
import com.comresource.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	/* (non-Javadoc)
	 * @see com.comresource.repository.ActivityRepository#findAllActivities()
	 */
	@Override
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<>();
		
		Activity activity1 = new Activity();
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		activities.add(activity1);
		
		Activity activity2 = new Activity();
		activity2.setDescription("Cycling");
		activity2.setDuration(120);
		activities.add(activity2);
		
		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		
		Activity activity1 = new Activity();
		activity1.setId("1234");
		activity1.setDescription("Swimming");
		activity1.setDuration(55);
		
		User user = new User();
		user.setId("5678");
		user.setName("jason"); 
		activity1.setUser(user);
		
		return activity1;
	}

	@Override
	public void create(Activity activity) {
		//should insert statement to the database
		
	}
	
	
}
