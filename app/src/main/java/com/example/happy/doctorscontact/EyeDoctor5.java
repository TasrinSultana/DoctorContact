package com.example.happy.doctorscontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EyeDoctor5 extends AppCompatActivity {

    private Button location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_doctor5);

        location = (Button) findViewById(R.id.Location);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickLocation();
            }
        });
    }

    public void ClickLocation(){
        Intent intent = new Intent(this, MapsActivity.class);
            startActivity(intent);

    }
}
