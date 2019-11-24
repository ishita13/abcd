package com.example.abcd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    Courses c;
    Faculty f;
    Freshers fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Courses c = new Courses();
        Faculty f = new Faculty();
        Freshers fr = new Freshers();
    }
        public void addfreshers(View v)
        {
            Intent intent=new Intent(MainActivity.this,add_fresher.class);
            startActivity(intent);
        }
        public void viewFreshers(View v)
        {
            fr.view_freshers();
        }

        public void Course_View (View v)
        {
            c.view_info();
        }
        public void addnewCourses (View v)
        {

            Intent intent=new Intent(this,AddNewCourse.class);
            startActivity(intent);
        }
        public void removecourse (View v)
        {

            Intent i=new Intent(this,AddNewCourse.class);
            startActivity(i);
        }

        public void removefaculty(View v)
        {
            Intent i=new Intent(this,AddFaculty.class);
            startActivity(i);

        }


        public void viewfaculty (View v)
        {
            f.view_faculty();
        }
        public void addfaculty (View v)
        {
            Intent i = new Intent(this, AddFaculty.class);
            startActivity(i);
        }



    }
