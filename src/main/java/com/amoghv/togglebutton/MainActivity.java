package com.amoghv.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDefaultToggleClick(View view) {
        Toast.makeText(this,"Good Ebening",Toast.LENGTH_SHORT).show();
    }

    public void onCustomToggleClick(View view) {
        Toast.makeText(this,"Thank You for the Like",Toast.LENGTH_SHORT).show();
    }
}