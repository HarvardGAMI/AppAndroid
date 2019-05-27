package com.example.cameratestv15;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.content.ActivityNotFoundException;

import java.io.File;



import java.net.URI;

public class CropImage extends AppCompatActivity {

    Uri uri;
    Intent cropIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_image);
       // Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        uri = patientimage.getPhotoURI ();
        CropFunction();
    }

    public void CropFunction () {
        try
        {
            cropIntent = new Intent("com.android.camera.action.CROP");
            cropIntent.setDataAndType(uri, "image/*");
            cropIntent.putExtra("crop", true);
            cropIntent.putExtra("outputX", 180);
            cropIntent.putExtra("outputY", 180);
            cropIntent.putExtra("aspectX", 3);
            cropIntent.putExtra("aspectY", 3);
            cropIntent.putExtra("scaleUpIfneeded", true);
            cropIntent.putExtra("return-data", true);

            startActivityForResult(cropIntent, 0);
        }
        catch (ActivityNotFoundException e) {

        }
    }

}
