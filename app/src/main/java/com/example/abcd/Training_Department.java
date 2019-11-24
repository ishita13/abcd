package com.example.abcd;


public class Training_Department
{
    private String name,id,password;
    public Training_Department(String n,String i,String pass)
    {
        name=n;
        id=i;
        password=pass;
    }


    public boolean request_status(int request_id)
    {
        boolean flag;
        flag=false;
        if(request_id==1)
            flag=true;
        else if(request_id==0)
            flag=false;

        return flag;
    }

    public String get_id()
    {
        return id;
    }

    public String get_password()
    {
        return password;
    }

    public String get_name()
    {
        return name;
    }

}
