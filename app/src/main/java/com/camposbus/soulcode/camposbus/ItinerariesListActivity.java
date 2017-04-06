package com.camposbus.soulcode.camposbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by henriquedealmeida on 21/03/17.
 */

public class ItinerariesListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itineraries_list);

        /*enquanto não tem database*/
        ArrayList<BusRoute> linhas_infoFav = new ArrayList<BusRoute>();
        linhas_infoFav.add(new BusRoute("Ceasa/St.Antonio"));
        linhas_infoFav.add(new BusRoute("Penha/Pecuária"));
        linhas_infoFav.add(new BusRoute("Bugalho"));
        linhas_infoFav.add(new BusRoute("Goitacazes"));
        linhas_infoFav.add(new BusRoute("Farol"));
        linhas_infoFav.add(new BusRoute("Travessão/Centro"));
        linhas_infoFav.add(new BusRoute("Donana/Centro"));
        linhas_infoFav.add(new BusRoute("Tocos/Centro"));
        linhas_infoFav.add(new BusRoute("Penha/Centro"));
        linhas_infoFav.add(new BusRoute("Nova Brasília"));
        linhas_infoFav.add(new BusRoute("Eldorado"));
        linhas_infoFav.add(new BusRoute("Pq.Guarus"));
        linhas_infoFav.add(new BusRoute("Bonsucesso"));


        InfoFavAdapter adapter = new InfoFavAdapter(this, linhas_infoFav);
        ListView listView = (ListView) findViewById(R.id.list_with_fav_itineraries);
        listView.setAdapter(adapter);
    }
}
