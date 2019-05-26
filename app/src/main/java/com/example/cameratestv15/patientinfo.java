package com.example.cameratestv15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class patientinfo extends AppCompatActivity {

    static String name, DOB;

    EditText nameInput, DOBInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientinfo);

        nameInput = (EditText) findViewById(R.id.patientname);
        DOBInput = (EditText) findViewById(R.id.patientDOB);
        submitButton = (Button) findViewById(R.id.submitinfo);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                DOB = DOBInput.getText().toString();
                Log.d("inputs", name);
                Log.d("inputs", DOB);
                startActivity(new Intent(patientinfo.this,patientimage.class));
                            }
        });
    }

    public static String getName()
    {
        return name;
    }
}
