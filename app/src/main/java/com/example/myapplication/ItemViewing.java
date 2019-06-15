package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ItemViewing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_viewing);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        EditText name=findViewById(R.id.name);
        EditText location=findViewById(R.id.location);
        EditText phone=findViewById(R.id.phone);
        EditText price=findViewById(R.id.price);
        EditText checkin=findViewById(R.id.checkin);
        name.setText(getIntent().getStringExtra("nameFood"));
        location.setText(getIntent().getStringExtra("locationFood"));
        phone.setText(getIntent().getStringExtra("phoneFood"));
        price.setText(getIntent().getStringExtra("priceFood"));
        checkin.setText(getIntent().getStringExtra("checkinFood"));
        Log.d("Position",getIntent().getStringExtra("positionClick"));
        final String message=getIntent().getStringExtra("positionClick");
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name=findViewById(R.id.name);
                EditText location=findViewById(R.id.location);
                EditText phone=findViewById(R.id.phone);
                EditText price=findViewById(R.id.price);
                EditText checkin=findViewById(R.id.checkin);
                String backStringname =name.getText().toString();
                String backStringlocation =location.getText().toString();
                String backStringphone =phone.getText().toString();
                String backStringprice =price.getText().toString();
                String backStringcheckin =checkin.getText().toString();
                Intent intent=new Intent();
                intent.putExtra("nameFoodBack",backStringname);
                intent.putExtra("locationFoodBack",backStringlocation);
                intent.putExtra("phoneFoodBack",backStringphone);
                intent.putExtra("priceFoodBack",backStringprice);
                intent.putExtra("checkinFoodBack",backStringcheckin);
                intent.putExtra("positionClickBack",message);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}
