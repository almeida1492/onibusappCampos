package com.camposbus.soulcode.camposbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by henriquedealmeida on 20/03/17.
 */

public class StopSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stop_selection);

        /*teste com um slot*/
        ArrayList<BusRoute> linhas_infoTime = new ArrayList<BusRoute>();
        linhas_infoTime.add(new BusRoute("Ceasa/St.Antonio", "02 min"));
        linhas_infoTime.add(new BusRoute("Penha/Pecuária", "04 min"));
        linhas_infoTime.add(new BusRoute("Bugalho", "08 min"));


        InfoTimeAdapter adapter = new InfoTimeAdapter(this, linhas_infoTime);
        ListView listView = (ListView) findViewById(R.id.list_with_time);
        listView.setAdapter(adapter);
    }
}
