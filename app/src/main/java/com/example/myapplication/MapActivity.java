//package com.example.myapplication;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.support.v4.app.FragmentActivity;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//
//import com.google.android.gms.common.api.Status;
//import com.google.android.gms.location.places.Place;
//import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
//import com.google.android.gms.location.places.ui.PlaceSelectionListener;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.OnMapReadyCallback;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.LatLng;
//
//public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
//
//    private GoogleMap mMap;
//    PlaceAutocompleteFragment placeAutoComplete;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_map);
//        placeAutoComplete = (PlaceAutocompleteFragment) getFragmentManager().findFragmentById(R.id.place_autocomplete);
//        placeAutoComplete.setOnPlaceSelectedListener(new PlaceSelectionListener() {
//            @Override
//            public void onPlaceSelected(Place place) {
//
//                Log.d("Maps", "Place selected: " + place.getName());
//                Intent returnIntent = new Intent();
//                returnIntent.putExtra("picked_point",place.getName());
//                setResult(Activity.RESULT_OK,returnIntent);
//                finish();
//            }
//            @Override
//            public void onError(Status status) {
//                Log.d("Maps", "An error occurred: " + status);
//            }
//        });
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
//    }
//
//    @Override
//    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//    }
//}
