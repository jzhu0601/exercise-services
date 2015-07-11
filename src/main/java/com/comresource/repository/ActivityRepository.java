package com.comresource.repository;

import java.util.List;

import com.comresource.model.Activity;

public interface ActivityRepository {

	List<Activity> findAllActivities();

	Activity findActivity(String activityId);

}