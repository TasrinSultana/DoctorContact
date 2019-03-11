package com.example.happy.doctorscontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonRajshahi, buttonDhaka, buttonSylhet, buttonChittagong, buttonRangpur, buttonBarishal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRajshahi = (Button) findViewById(R.id.buttonRajshahi);
        buttonDhaka = (Button) findViewById(R.id.buttonDhaka);
        buttonSylhet = (Button) findViewById(R.id.buttonSylhet);
        buttonChittagong = (Button) findViewById(R.id.buttonChittagong);
        buttonRangpur = (Button) findViewById(R.id.buttonRangpur);
        buttonBarishal = (Button) findViewById(R.id.buttonBarishal);

        buttonRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalDepartment();

            }
        });
        buttonDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalDepartment();
            }
        });

        buttonSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalDepartment();
            }
        });

        buttonChittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalDepartment();
            }
        });

        buttonRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalDepartment();
            }
        });

        buttonBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMedicalDepartment();
            }
        });


    }

    public void openMedicalDepartment(){
        Intent intent = new Intent(this, MedicalDepartment.class);
        startActivity(intent);
	// It will start MedicalDepartment Activity
	// This click function direct at Medical Department page
    }

}
