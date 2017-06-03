package com.example.preeti.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //Because Recycler view is in main and Adapter we will create here to set to Recylerview we will create list here
    //so wherver you create adapter you create list because you wont be able to create adapter i will show you
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Now how to set is first we need Recyclerview here
        RecyclerView recyclerView =  (RecyclerView) findViewById(R.id.recycler_view);

       //Create Adapter adapter need list so create it first with data

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("Snehal");
        employeeList.add("Roma");
        //Pass this list to adapter and it will call 3 times for each row

        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList);

        //set adapter to Reclerview and you have to tell how data should be diplayed ie. Vertical list of grid
        // I had told you right Recylerview can be list means Linear or Grid uska alag class hai
        //so we create object and say set lineat using layout manager
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);


        //Then we finally set adapter to recylerview

        recyclerView.setAdapter(employeeAdapter);


        //Done :D :) lets run
    }
}
