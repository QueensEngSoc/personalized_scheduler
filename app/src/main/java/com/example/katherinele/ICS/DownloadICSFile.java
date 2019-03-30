package com.example.katherinele.ICS;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.AsyncTask;
import android.util.Log;
import com.example.katherinele.ICS.AsyncTaskObserver;

public class DownloadICSFile extends AsyncTask<String, Integer, String> {
    private AsyncTaskObserver mObserver;

    public DownloadICSFile(AsyncTaskObserver observer){
        mObserver = observer;
    }
    protected String doInBackground(String... sUrl){
        try {
            URL url = new URL(sUrl[0]);
            HttpURLConnection connection;
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) { //request has success httpstatus
                return "Server returned HTTP " + connection.getResponseCode()
                        + " " + connection.getResponseMessage();
            }
            mObserver.duringTask(connection);
        } catch (IOException e) {
            Log.d("HELLOTHERE", e.getMessage());
        }
        return null;

    }
}
