package com.example.proyecto.services;

import java.util.ArrayList;
import java.lang.reflect.Type;
import android.content.Context;


import android.content.Intent;
import android.app.IntentService;
import android.preference.PreferenceManager;
import android.content.res.Resources;
//import com.google.android.gms.location.ActivityRecognitionResult;

//Extend IntentService//
class ActivityIntentService extends IntentService {
    protected static final String TAG = "Activity";
    //Call the super IntentService constructor with the name for the worker thread//
    public ActivityIntentService() {
        super(TAG);
    }
    @Override
    public void onCreate() {
        super.onCreate();
    }

    //Define an onHandleIntent() method, which will be called whenever an activity detection update is available//
    @Override
    protected void onHandleIntent(Intent intent) {
        //Check whether the Intent contains activity recognition data//
        /*if (ActivityRecognitionResult.hasResult(intent)) {

            //If data is available, then extract the ActivityRecognitionResult from the Intent//
            ActivityRecognitionResult result = ActivityRecognitionResult.extractResult(intent);

            //Get an array of DetectedActivity objects//
            ArrayList<DetectedActivity> detectedActivities = (ArrayList) result.getProbableActivities();
            PreferenceManager.getDefaultSharedPreferences(this)
                    .edit()
                    .putString(RetosFragment.DETECTED_ACTIVITY,
                            detectedActivitiesToJson(detectedActivities))
                    .apply();

        }*/
    }
//Convert the code for the detected activity type, into the corresponding string//

    public static String getActivityString(Context context, int detectedActivityType) {
        /*if (context != null) {
            Resources resources = context.getResources();
            switch(detectedActivityType) {
                case DetectedActivity.ON_BICYCLE:
                    return resources.getString(R.string.bicycle);
                case DetectedActivity.ON_FOOT:
                    return resources.getString(R.string.foot);
                case DetectedActivity.RUNNING:
                    return resources.getString(R.string.running);
                case DetectedActivity.STILL:
                    return resources.getString(R.string.still);
                case DetectedActivity.TILTING:
                    return resources.getString(R.string.tilting);
                case DetectedActivity.WALKING:
                    return resources.getString(R.string.walking);
                case DetectedActivity.IN_VEHICLE:
                    return resources.getString(R.string.vehicle);
                default:
                    return resources.getString(R.string.unknown_activity, detectedActivityType);
            }
        }*/
        return "";
    }
    static final int[] POSSIBLE_ACTIVITIES = {

            /*DetectedActivity.STILL,
            DetectedActivity.ON_FOOT,
            DetectedActivity.WALKING,
            DetectedActivity.RUNNING,
            DetectedActivity.IN_VEHICLE,
            DetectedActivity.ON_BICYCLE,
            DetectedActivity.TILTING,
            DetectedActivity.UNKNOWN*/
    };
    /*static String detectedActivitiesToJson(ArrayList<DetectedActivity> detectedActivitiesList) {
        Type type = new TypeToken<ArrayList<DetectedActivity>>() {}.getType();
        return new Gson().toJson(detectedActivitiesList, type);
    }
    public static ArrayList<DetectedActivity> detectedActivitiesFromJson(String jsonArray) {
        Type listType = new TypeToken<ArrayList<DetectedActivity>>(){}.getType();
        ArrayList<DetectedActivity> detectedActivities = new Gson().fromJson(jsonArray, listType);
        if (detectedActivities == null) {
            detectedActivities = new ArrayList<>();
        }
        return detectedActivities;
    }*/
}
