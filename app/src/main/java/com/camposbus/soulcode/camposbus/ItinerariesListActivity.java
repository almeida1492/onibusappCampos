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
        ArrayList<InfoFav> linhas_infoFav = new ArrayList<InfoFav>();
        linhas_infoFav.add(new InfoFav("Ceasa/St.Antonio"));
        linhas_infoFav.add(new InfoFav("Penha/Pecuária"));
        linhas_infoFav.add(new InfoFav("Bugalho"));
        linhas_infoFav.add(new InfoFav("Goitacazes"));
        linhas_infoFav.add(new InfoFav("Farol"));
        linhas_infoFav.add(new InfoFav("Travessão/Centro"));
        linhas_infoFav.add(new InfoFav("Donana/Centro"));
        linhas_infoFav.add(new InfoFav("Tocos/Centro"));
        linhas_infoFav.add(new InfoFav("Penha/Centro"));
        linhas_infoFav.add(new InfoFav("Nova Brasília"));
        linhas_infoFav.add(new InfoFav("Eldorado"));
        linhas_infoFav.add(new InfoFav("Pq.Guarus"));
        linhas_infoFav.add(new InfoFav("Bonsucesso"));


        InfoFavAdapter adapter = new InfoFavAdapter(this, linhas_infoFav);
        ListView listView = (ListView) findViewById(R.id.list_with_fav_itineraries);
        listView.setAdapter(adapter);
    }
}
