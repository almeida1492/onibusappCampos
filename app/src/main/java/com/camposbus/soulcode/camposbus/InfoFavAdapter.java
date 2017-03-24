package com.camposbus.soulcode.camposbus;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by henriquedealmeida on 21/03/17.
 */

public class InfoFavAdapter extends ArrayAdapter<InfoFav>{

    public InfoFavAdapter(Activity context, ArrayList<InfoFav> linhas_infoFav){
        super(context, 0, linhas_infoFav);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fav_item, parent, false);
        }

        InfoFav currentInfoFav = getItem(position);



        /*deals with the name attribute adaption*/

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.linha_nome_fav);

        nameTextView.setText(currentInfoFav.getName());



        /*deals with the favorite status attribute adaption*/

        ImageView favIndicator = (ImageView) listItemView.findViewById(R.id.linha_fav_indicator);

        if(currentInfoFav.getFavStatus()){
            favIndicator.setImageResource(R.drawable.favicon); /*missing right resource here*/
        }
        else{
            favIndicator.setImageResource(R.drawable.favicon);
        }

        return listItemView;
    }
}
