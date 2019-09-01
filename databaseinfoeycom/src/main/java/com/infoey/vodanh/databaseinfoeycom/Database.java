package com.infoey.vodanh.databaseinfoeycom;

import android.app.Activity;
import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import static com.infoey.vodanh.databaseinfoeycom.MainActivity.json;
import static com.infoey.vodanh.databaseinfoeycom.MainActivity.website;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Database extends AsyncTask<Void,Void,String> {
    public static String data,data2,data3;
    public static String data4,data5,data6;
    private final TaskListener taskListener;
    public static String sinParsed = "";
    public static String sivParsed = "";
    public static String sibParsed = "";
    public static String simParsed = "";
    public static String siqParsed = "";
    private String moviedata,moviedata1,moviedata2;
    private String moviedata3,moviedata4,moviedata5;
    private String moviedata6,moviedata7,data7;
    public Database(Activity activity){
        taskListener = (TaskListener) activity;
    }
    @Override
    public String doInBackground(Void... voids) {
        try {
            URL url = new URL(website+json);
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
                moviedata = "" + JO.get("website1");moviedata1 = "" + JO.get("website2");
                moviedata2 = "" + JO.get("website3");moviedata3 = "" + JO.get("website4");
                moviedata4 = "" + JO.get("website5");moviedata5 = "" + JO.get("website6");
                moviedata6 = "" + JO.get("website7");moviedata7 = "" + JO.get("website8");
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
        try {
            URL url = new URL(moviedata1);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line2 = "";
            while (line2 != null) {
                line2 = bufferedReader.readLine();
                data2 = data2 + line2;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            URL url = new URL(moviedata2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line3 = "";
            while (line3 != null) {
                line3 = bufferedReader.readLine();
                data3 = data3 + line3;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            URL url = new URL(moviedata4);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line4 = "";
            while (line4 != null) {
                line4 = bufferedReader.readLine();
                data4 = data4 + line4;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            URL url = new URL(moviedata5);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line5 = "";
            while (line5 != null) {
                line5 = bufferedReader.readLine();
                data5 = data5 + line5;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            URL url = new URL(moviedata6);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line6 = "";
            while (line6 != null) {
                line6 = bufferedReader.readLine();
                data6 = data6 + line6;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }try {
            URL url = new URL(moviedata7);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line7 = "";
            while (line7 != null) {
                line7 = bufferedReader.readLine();
                data7 = data7 + line7;
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
