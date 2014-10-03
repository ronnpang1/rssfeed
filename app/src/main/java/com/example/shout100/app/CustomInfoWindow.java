package com.example.shout100.app;
import org.osmdroid.bonuspack.overlays.MarkerInfoWindow;
import org.osmdroid.views.MapView;
import android.app.Activity;
/**
 * Created by ronnie on 12/06/14.
 */
public class CustomInfoWindow extends MarkerInfoWindow {

    public CustomInfoWindow(MapView mapView) {


        super(R.layout.bonuspack_bubble, mapView);
    }
}