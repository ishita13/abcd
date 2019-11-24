package com.example.abcd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;





    public class Database extends SQLiteOpenHelper {
        static final String Databas = "student.db";
        static final String Table_name = "newcourse";
        static final String col1 = "ID";
        static final String col2 = "NAME";
        static final String col3 = "course";
        static final String col4 = "people_number";
        static final String col5 = "faculty";


        public Database(Context context)
        {
            super(context, Databas, null, 1);

        }

        @Override
        public void onCreate(SQLiteDatabase database)
        {
            database.execSQL("Create table " + Table_name + "(ID INTEGER PRIMARY KEY AUTOINCREMENT ,NAME,course,people_number,faculty)");

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + Table_name);
            onCreate(db);
        }


        public boolean insertData(String name, String course, String people_number,String faculty) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(col2, name);
            contentValues.put(col3, course);
            contentValues.put(col4, people_number);
            contentValues.put(col5,faculty);
            long result = db.insert(Table_name, null, contentValues);
            if (result != -1)
                return true;
            else
                return false;
        }

        public Cursor getAllData() {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor r = db.rawQuery("SELECT * FROM  "+ Table_name + " ORDER BY ID DESC  " ,null);
            return r;
        }
    }

