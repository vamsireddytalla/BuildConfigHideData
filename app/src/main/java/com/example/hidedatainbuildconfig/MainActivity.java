package com.example.hidedatainbuildconfig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hidedatainbuildconfig.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Log.d(TAG, "Welcome to Tech Brainz Subscribe for more Videos");

        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.et1.setText(BuildConfig.API_KEY);
            }
        });
    }
}