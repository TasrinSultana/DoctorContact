package com.example.happy.doctorscontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EyeDepartment extends AppCompatActivity {

    private Button eyeDoctor1, eyeDoctor2, eyeDoctor3, eyeDoctor4,eyeDoctor5, eyeDoctor6;
    // All eye doctor initialized

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_department);

        eyeDoctor1 = (Button) findViewById(R.id.button_EyeD1);
        eyeDoctor2 = (Button) findViewById(R.id.button_EyeD2);
        eyeDoctor3 = (Button) findViewById(R.id.button_EyeD3);
        eyeDoctor4 = (Button) findViewById(R.id.button_EyeD4);
        eyeDoctor5 = (Button) findViewById(R.id.button_EyeD5);
        eyeDoctor6 = (Button) findViewById(R.id.button_EyeD6);

        eyeDoctor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDoctor1();
            }
        });

        eyeDoctor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDoctor2();
            }
        });

        eyeDoctor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDoctor3();
            }
        });

        eyeDoctor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDoctor4();
            }
        });

       eyeDoctor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDoctor5();
            }
        });

        eyeDoctor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEyeDoctor6();
            }
        });


    }

    public void openEyeDoctor1() {
        Intent intent = new Intent(this, EyeDoctor1.class);
        startActivity(intent);

    }

    public void openEyeDoctor2() {
        Intent intent = new Intent(this, EyeDoctor2.class);
        startActivity(intent);

    }

   public void openEyeDoctor3() {
        Intent intent = new Intent(this, EyeDoctor3.class);
        startActivity(intent);

    }

    public void openEyeDoctor4() {
        Intent intent = new Intent(this, EyeDoctor4.class);
        startActivity(intent);

    }

   public void openEyeDoctor5() {
        Intent intent = new Intent(this, EyeDoctor5.class);
        startActivity(intent);

    }

    public void openEyeDoctor6() {
        Intent intent = new Intent(this, EyeDoctor6.class);
        startActivity(intent);

    }
}
