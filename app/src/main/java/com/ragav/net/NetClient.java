package com.ragav.net;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by ragavendran on 17-06-2015.
 */
public class NetClient
{
    public static JSONObject source() {

        JSONObject jsonObject = null;
        JSONArray jsonArray = null;
        String output;
        String concatoutput = "";
       // JSONObject jsonObject1 = null;

        try {

            URL url = new URL("http://localhost:80/events/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed PHP: HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));



          //  System.out.println("Output from Server .... \n");

            while ((output = br.readLine()) != null)
            {
                concatoutput += output;
               // System.out.println("Output"+" "+output);
            }
            conn.disconnect();
            //System.out.println(concatoutput);
            Log.d("COncat Output",concatoutput);

            try
            {
                String temp = "{\"title\":\"Event 1\",\"content\":\"Sample Desc 1\",\"date\":\"2015-06-18 00:00:00\"}";
                jsonObject = new JSONObject("{\"phonetype\":\"N95\",\"cat\":\"WP\"}");
               // jsonArray = new JSONArray(concatoutput);
              // jsonObject = new JSONObject(temp);
               // System.out.println("Json Return"+""+jsonObject.toString());
                Log.d("Json String Output",jsonObject.toString());
            } catch (JSONException js) {
                js.printStackTrace();
            }

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }


        return jsonObject;
    }

}
