/**
 * Created by Pang on 23/07/2014.
 */
import org.osmdroid.bonuspack.overlays.Marker;
import org.osmdroid.bonuspack.overlays.MarkerInfoWindow;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import android.app.Activity;

import com.example.shout100.app.R;

public class display2 extends Activity {

    public void display(String id,MapView mMapView){
        if(id=="test"){
            GeoPoint point = new GeoPoint(45.508669900,  -73.653992499999990);
            Marker startmark1 = new Marker(mMapView);
            startmark1.setPosition(point);
            mMapView.getOverlays().add(startmark1);
            startmark1.setIcon(getResources().getDrawable(R.drawable.marker_cluster));


        }


    }
}
