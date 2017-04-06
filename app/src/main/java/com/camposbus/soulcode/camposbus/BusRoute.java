package com.camposbus.soulcode.camposbus;

/**
 * Created by henriquedealmeida on 06/04/17.
 */

public class BusRoute {

    //attributes
    private String mbusRouteName;
    private String mbusRouteTime;
    private boolean mfavStatus;


    //contructors
    public BusRoute(String busRouteName){
        mbusRouteName = busRouteName;
        mfavStatus = false;
    }

    public BusRoute(String busRouteName, String busRouteTime){
        mbusRouteName = busRouteName;
        mbusRouteTime = busRouteTime;
    }


    //methods
    public String getRouteName(){
        return mbusRouteName;
    }

    public String getRouteTime(){
        return mbusRouteTime;
    }

    public boolean getFavStatus(){
        return mfavStatus;
    }

    public void setFavStatus(){
        if(mfavStatus){
            mfavStatus = false;
        }
        else{
            mfavStatus = true;
        }
    }
}
