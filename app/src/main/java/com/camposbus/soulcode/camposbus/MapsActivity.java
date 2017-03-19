package com.camposbus.soulcode.camposbus;

import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MapsActivity extends SupportMapFragment implements OnMapReadyCallback{

    private static final String TAG = "puts grilla!";

    private GoogleMap mMap;

    LocationManager locationManager;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

            locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);

            Criteria criteria = new Criteria();

            String provider = locationManager.getBestProvider(criteria, true);

            mMap = googleMap;

        //Controle do zoom
//            mMap.getUiSettings().setZoomControlsEnabled(true);
        //Buscar localização atual do usuario
//            mMap.setMyLocationEnabled(true);


        // Posiciona a câmera na localização atual do usuário
        LatLng atual = new LatLng(locationManager.getLastKnownLocation(provider).getLatitude(), locationManager.getLastKnownLocation(provider).getLongitude());
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(atual, 14));
        mMap.addMarker(new MarkerOptions().position(atual).title("Você está aqui"));
        mMap.animateCamera(CameraUpdateFactory.zoomIn());
        mMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);

    }

}
