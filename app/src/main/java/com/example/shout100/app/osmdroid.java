/*package com.example.shout100.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;



    private MapController mapController;
    private MapView mapView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setBuiltInZoomControls(true);

        mapController.setZoom(15);
        GeoPoint point2 = new GeoPoint(51.496994, -13.4733);
        mapController.setCenter(point2);
    }
    protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        return false;
    }
} */