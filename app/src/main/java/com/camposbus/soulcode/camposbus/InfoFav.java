package com.camposbus.soulcode.camposbus;

/**
 * Created by henriquedealmeida on 21/03/17.
 */

public class InfoFav {

    private String linhaNome;
    private boolean isFav;

    public InfoFav(String nameInput){
        linhaNome = nameInput;
        isFav = false;
    }

    public String getName(){
        return linhaNome;
    }

    public boolean getFavStatus(){
        return isFav;
    }

    public void setFavStatus(){
        if(isFav){
            isFav = false;
        }
        else{
            isFav = true;
        }
    }
}
