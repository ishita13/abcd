package com.example.abcd;
import java.util.ArrayList;
import java.util.Scanner;

public class Courses
{
    private int courseid,no_of_students;
    private String course_faculty,name;
    private boolean is_Available;
    ArrayList<String> arrli = new ArrayList<String>(100);

    public Courses(int courseid,int number,String name,String faculty,boolean available)
    {
        this.courseid=courseid;
        no_of_students=number;
        course_faculty=faculty;
        is_Available=available;
        this.name=name;
    }
    public Courses()
    {

    }

    public void add_courses(String new_course,int course_id,int num,boolean avail,String faculty_name )
    {
        for (int i=0; i<arrli.size(); i++)
        {
            if(arrli.get(i)==new_course)
                is_Available=true;
        }
        if(is_Available==false)
        {
            arrli.add(new_course);
            allocate(new_course);
        }
        else
        {
            allocate(new_course);
        }
    }

    public void allocate(String new_course)
    {

    }
    public void view_info()
    {
        System.out.println("Course_name | course_id | number | faculty | is_Available");
        System.out.println(name +"|"+ courseid+ "|" +no_of_students+ "|" +course_faculty+ "|" +is_Available);
    }

    public void remove_course()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name of the course you want to delete");
        String s=sc.nextLine();
        arrli.remove(new String (s));
    }

}

