package com.example.katherinele.database;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import com.example.katherinele.ICS.AsyncTaskObserver;
import com.example.katherinele.Utility.Constants;
import com.example.katherinele.Utility.DownloadTextTask;

/**
 * Async task that downloads and parses the cloud database into the phone database.
 */
public class GetCloudDb extends DownloadTextTask<Void, Void> {
    private static final String TAG_SUCCESS = "Success";

    public GetCloudDb(AsyncTaskObserver observer) {
        super(observer);
    }

    @Override
    protected Void backgroundTask(Void val) {
        try {
            //call php script on server that gets info from cloud database
            JSONObject json = new JSONObject(getText(Constants.GET_DATABASE));
            int success = json.getInt(TAG_SUCCESS);
            if (success == 1) {
                mObserver.duringTask(json);
            }
        } catch (JSONException e) {
            Log.d("HELLOTHERE", "BAD: " + e);
        }
        return null;
    }
}
