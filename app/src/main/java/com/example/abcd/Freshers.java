package com.example.abcd;

import java.util.ArrayList;

public class Freshers
{
    private String name,dept_allocated,course;
    private int emp_id;
    ArrayList<String> arrliFresh = new ArrayList<String>(100);
    private boolean isCourseAllocated=false;


    public Freshers(String name,String dept,String course,int emp_id,boolean isCourseAllocated )
    {
        this.name=name;
        dept_allocated=dept;
        this.emp_id=emp_id;
        this.course=course;
        this.isCourseAllocated=isCourseAllocated;
    }
    public Freshers()
    {

    }

    public void allocate_course(String new_course)
    {
        if(isCourseAllocated==false)
        {
            course=new_course;
            isCourseAllocated=true;
        }
    }

    public void add_freshers(String add_new_emp,String dept,int emp_id,boolean isCourse,String course )
    {
        arrliFresh.add(add_new_emp);
    }
    public void view_freshers()
    {

    }
}
