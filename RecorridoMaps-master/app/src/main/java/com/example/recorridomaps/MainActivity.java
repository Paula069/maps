package com.example.recorridomaps;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowLocationIbis(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Ibis+Budget+Chapinero,+Bogotá,+Cundinamarca");
        openMap(gmmIntentUri);
    }

    public void onShowLocationPiqueteadero(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=5.057883626713508,-73.98234964675565(Piqueteadero Campestre El Pino)");
        openMap(gmmIntentUri);
    }

    public void onShowLocationMosquera(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=4.705411875628302,-74.2303825890847(Parque Principal Mosquera)");
        openMap(gmmIntentUri);
    }

    public void onShowDirectionsToIbis(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.642257,-74.060747&destination=4.6953,-74.0649&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void onShowDirectionsToPiqueteadero(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.642257,-74.060747&destination=5.057883626713508,-73.98234964675565&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void onShowDirectionsToMosquera(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.642257,-74.060747&destination=4.705411875628302,-74.2303825890847&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void onShowDirectionsToZipaquira(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.642257,-74.060747&destination=5.026289149696547,-74.00179414592765&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void onShowDirectionsToBucaramanga(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.642257,-74.060747&destination=7.121761955139725,-73.12820190662153&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    public void onShowDirectionsToMadrid(View view) {
        Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=4.642257,-74.060747&destination=40.41849784896535,-3.6925971744481627&travelmode=driving");
        openDirections(gmmIntentUri);
    }

    private void openMap(Uri uri) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
        mapIntent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(mapIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "Por favor, instala una aplicación de mapas", Toast.LENGTH_LONG).show();
        }
    }

    private void openDirections(Uri uri) {
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
