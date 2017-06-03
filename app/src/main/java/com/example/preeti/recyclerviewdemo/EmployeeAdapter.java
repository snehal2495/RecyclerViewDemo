package com.example.preeti.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by preeti on 3/6/17.
 */

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    //we need to create public constructor here, what we want? ArrayList
    private ArrayList<String> employeeList;

    public EmployeeAdapter(ArrayList<String> employeeList){

        this.employeeList = employeeList;
    }


    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.employee_list_item,viewGroup,false);
        EmployeeViewHolder employeeViewHolder=new EmployeeViewHolder(view);
        return employeeViewHolder;
    }


    //When we create Adapter and set to recyclerview it will get till list size time
    // suppose our employye list size is 3 names it will get called for each row so total 3 times

    @Override
    public void onBindViewHolder(final EmployeeViewHolder employeeViewHolder, int position) {

        //And position here represent which row it is rending
        //this method binds xml and gives us this ViewholderClass to use XMl

        // now I want to set name from Arraylist to textview right?

        //I will do this
        // why I am passing position means for first row give me list first name
        //you dont have to write it 3 times because this method will get called automaicaly 3 times for every row
        // Debugging we saw values were correct it means your layout is having some problem
        String emplpyeeName = employeeList.get(position);
        employeeViewHolder.employeeName.setText(emplpyeeName);
    }

    //no code will stop watch me I want to check few things so see how I am doing
    // We missed this method. This method tells adpater how many rows so in this ccase list size right?

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder
    {
        TextView employeeName;
       public EmployeeViewHolder(View view){
           super(view);

         employeeName=(TextView)view.findViewById(R.id.name_textview);

        }

    }


}
