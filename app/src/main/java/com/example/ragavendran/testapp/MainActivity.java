package com.example.ragavendran.testapp;

import android.app.Activity;
import android.app.TabActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TextView;

import com.ragav.net.NetClient;

import org.json.JSONObject;
import android.os.StrictMode;


public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /* Tab Host Code starts*/
      /*  TabHost tabs = getTabHost();
        tabs.setup();

        TabHost.TabSpec kidsandmen = tabs.newTabSpec("Kids and Men");
        kidsandmen.setIndicator("Kids and Men");
        tabs.addTab(kidsandmen);

        TabHost.TabSpec women = tabs.newTabSpec("Women");
        women.setIndicator("Women");
        tabs.addTab(women);

        TabHost.TabSpec essentails = tabs.newTabSpec("Essentials");
        essentails.setIndicator("Essentials");
        tabs.addTab(essentails);

        TabHost.TabSpec others = tabs.newTabSpec("Others");
        others.setIndicator("Others");
        tabs.addTab(others);
*/
        /* Tab Host Code starts*/
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
        // JSONObject jsonObject = NetClient.source();
       // String jj = NetClient.source();
        // System.out.println("result"+""+jj);
        System.out.println("Hello World");
        System.out.println("Hello Android");

        
       // TextView tv = (TextView) findViewById(R.id.jsontext);
     //   tv.setText(jsonObject.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
