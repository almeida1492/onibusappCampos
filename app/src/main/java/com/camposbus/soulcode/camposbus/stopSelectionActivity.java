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
        ArrayList<Info> linhas_info = new ArrayList<Info>();
        linhas_info.add(new Info("Ceasa/St.Antonio", "02 min"));
        linhas_info.add(new Info("Penha/Pecuária", "04 min"));
        linhas_info.add(new Info("Bugalho", "08 min"));


        InfoAdapter adapter = new InfoAdapter(this, linhas_info);
        ListView listView = (ListView) findViewById(R.id.list_with_time);
        listView.setAdapter(adapter);
    }
}
