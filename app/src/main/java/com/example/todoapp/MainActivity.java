package com.example.todoapp;

//import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items; //Define a list of String

    // Get a reference of each view on our MainActivity.java file
    Button btnAdd;
    EditText edItem;
    RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //What we will do with the variables
        btnAdd = findViewById(R.id.btnAdd);
        edItem = findViewById(R.id.edItem);
        rvItems = findViewById(R.id.rvItems);

        edItem.setText("I am doing Android");

        items = new ArrayList<>(); //Instantiate the model
        //add some data
        items.add("Reading The Bible");
        items.add("Working on Java Programming");
        items.add("Rehearsal with the Worship Team");

    }
}
