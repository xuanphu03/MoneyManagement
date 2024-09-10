package com.Xuna.moneymanagement;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Create array
        ArrayList<String> arrayName = new ArrayList<>();

        //Add element
        arrayName.add("Java");
        arrayName.add("JavaScript");
        arrayName.add("TypeScript");

        //Get length
        Log.d("Xuna", "SIZE:" + arrayName.size());

        //Get element
        Log.d("Xuna", "ELEMENT:" + arrayName.get(1));

        //Remove
        arrayName.remove(1);

        //Get length
        Log.d("Xuna", "SIZE:" + arrayName.size());

        //Get element
        Log.d("Xuna", "ELEMENT:" + arrayName.get(1));

        arrayName.add("Python");
        arrayName.add("C++");

        //Same forEach
        for (String ten : arrayName) {
            Log.d("Xuna", ten);
        }
    }
}