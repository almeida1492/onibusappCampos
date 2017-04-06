package com.camposbus.soulcode.camposbus;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by henriquedealmeida on 20/03/17.
 */

public class InfoTimeAdapter extends ArrayAdapter<BusRoute> {
    public InfoTimeAdapter(Activity context, ArrayList<BusRoute> linhas_infoTime){
        super(context, 0, linhas_infoTime);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.stop_selection_item, parent, false);
        }

        BusRoute currentInfoTime = getItem(position);


        /*deals with the name attribute adaption*/

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.linha_nome);

        nameTextView.setText(currentInfoTime.getRouteName());

        /*deals with the time attribute adaption*/

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.tempo_restante);

        numberTextView.setText(currentInfoTime.getRouteTime());

        return listItemView;
    }
}

