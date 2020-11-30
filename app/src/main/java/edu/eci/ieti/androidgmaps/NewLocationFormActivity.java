package edu.eci.ieti.androidgmaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import edu.eci.ieti.androidgmaps.model.GeoLocation;
import edu.eci.ieti.androidgmaps.model.MyLocation;

public class NewLocationFormActivity extends AppCompatActivity {
    private TextView nombre,descripcion,longitud,latitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_location_form);
        nombre = (TextView) findViewById(R.id.locationName);
        descripcion = (TextView) findViewById(R.id.locationDescription);
        longitud = (TextView) findViewById(R.id.longitud);
        latitud = (TextView) findViewById(R.id.latitud);
    }

    public void onButtonClicked(View view){
        float lon = Float.parseFloat(longitud.getText().toString());
        float lat = Float.parseFloat(latitud.getText().toString());
        MyLocation ml = new MyLocation(nombre.getText().toString(),descripcion.getText().toString(),lon,lat);
        System.out.println(ml);
        Intent intent=new Intent();
        intent.putExtra("location",  ml);
        setResult(2,intent);
        finish();
    }
}