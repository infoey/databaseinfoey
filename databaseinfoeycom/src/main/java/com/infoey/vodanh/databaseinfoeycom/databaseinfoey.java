package com.infoey.vodanh.databaseinfoeycom;

import android.app.Activity;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class databaseinfoey extends AsyncTask<Void,Void,String> {
    public static String data = "";
    public static String website = "https://databaseinfoey.netlify.com/";
    private final TaskListener taskListener;
    public static String sinParsed = "";
    public static String sivParsed = "";
    public static String sibParsed = "";
    public static String simParsed = "";
    public static String siqParsed = "";
    private String moviedata;
    public databaseinfoey(Activity activity){
        taskListener = (TaskListener) activity;
    }
    @Override
    public String doInBackground(Void... voids) {
        try {
            URL url = new URL(website+"main.txt");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String lin = "";
            String date = "";
            while (lin != null) {
                lin = bufferedReader.readLine();
                date = date + lin;
            }
            JSONArray JA = new JSONArray(date);
            for (int i = 0; i < JA.length(); i++) {
                JSONObject JO = (JSONObject) JA.get(i);
                moviedata = "" + JO.get("website");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            URL url = new URL(moviedata);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    protected void onPostExecute(String s) {
        taskListener.onTaskFinish(s);
        super.onPostExecute(s);
    }
}
