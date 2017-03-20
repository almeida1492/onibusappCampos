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

public class InfoAdapter extends ArrayAdapter<Info> {
    public InfoAdapter(Activity context, ArrayList<Info> linhas_info){
        super(context, 0, linhas_info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.stop_selection_item, parent, false);
        }

        Info currentInfo = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.linha_nome);

        nameTextView.setText(currentInfo.getLinhaNome());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.tempo_restante);

        numberTextView.setText(currentInfo.getTempoRestante());

        return listItemView;
    }
}

