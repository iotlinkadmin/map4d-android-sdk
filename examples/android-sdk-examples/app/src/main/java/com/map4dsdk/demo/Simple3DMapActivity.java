package com.map4dsdk.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.map4d.map4dsdk.maps.MFSupportMapFragment;
import vn.map4d.map4dsdk.maps.Map4D;
import vn.map4d.map4dsdk.maps.OnMapReadyCallback;

public class Simple3DMapActivity extends AppCompatActivity implements OnMapReadyCallback{

    private MFSupportMapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple3d_map_activity);
        mapFragment = (MFSupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map3D);
        mapFragment.getMapAsync(this);
        getSupportActionBar().setTitle(R.string.map3dDemo);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onMapReady(Map4D map4D) {
        map4D.setMinZoomPreference(17.f);
        map4D.enable3DMode(true);
    }
}
