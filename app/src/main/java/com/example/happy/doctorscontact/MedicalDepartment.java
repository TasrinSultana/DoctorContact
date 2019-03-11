package com.example.happy.doctorscontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedicalDepartment extends AppCompatActivity {

    private Button buttonEyeDp, buttonEarDp, buttonSkinDp, buttonDentalDp, buttonBrainDp, buttonFemaleDp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_department);

        buttonEyeDp = (Button) findViewById(R.id.buttonEye);
        buttonEarDp = (Button) findViewById(R.id.buttonEar);
        buttonSkinDp = (Button) findViewById(R.id.buttonSkin);
        buttonDentalDp = (Button) findViewById(R.id.buttonDental);
        buttonBrainDp = (Button) findViewById(R.id.buttonBrain);
        buttonFemaleDp = (Button) findViewById(R.id.buttonFemale);

        buttonEyeDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDepartment();
            }
        });



        buttonEarDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEarDepartment();
            }
        });

        buttonSkinDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSkinDepartment();
            }
        });

        buttonDentalDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDentalDepartment();
            }
        });

        buttonBrainDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrainDepartment();
            }
        });

        buttonFemaleDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGynocologyDepartment();
            }
        });



    }

    public void openEyeDepartment(){
        Intent intent = new Intent(this, EyeDepartment.class);
        startActivity(intent);
	//This will start EyeDepartment Actity
    }

    public void openEarDepartment(){
        Intent intent = new Intent(this, EarDepartment.class);
        startActivity(intent);
    }

    public void openSkinDepartment(){
        Intent intent = new Intent(this, SkinDepartment.class);
        startActivity(intent);
	// This will start SkinDepartment Activity
    }

    public void openDentalDepartment(){
        Intent intent = new Intent(this, DentalDepartment.class);
        startActivity(intent);
    }

    public void openBrainDepartment(){
        Intent intent = new Intent(this, BrainDepartment.class);
        startActivity(intent);
    }

    public void openGynocologyDepartment(){
        Intent intent = new Intent(this, GynocologyDepartment.class);
        startActivity(intent);
    }

}
