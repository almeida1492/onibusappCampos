package com.camposbus.soulcode.camposbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by henriquedealmeida on 21/03/17.
 */

public class FavActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fav_list);

        /*teste com um slot*/
        ArrayList<BusRoute> linhas_infoFav = new ArrayList<BusRoute>();
        linhas_infoFav.add(new BusRoute("Ceasa/St.Antonio"));
        linhas_infoFav.add(new BusRoute("Penha/Pecuária"));
        linhas_infoFav.add(new BusRoute("Bugalho"));


        InfoFavAdapter adapter = new InfoFavAdapter(this, linhas_infoFav);
        ListView listView = (ListView) findViewById(R.id.list_with_fav);
        listView.setAdapter(adapter);
    }
}
