package com.example.abcd;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.dropdown.R;

import java.util.Arrays;
import java.util.List;

public class AddFaculty extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        btn = findViewById(R.id.btn11);
        final TextView tv = (TextView) findViewById(R.id.tv);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Build an AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(AddFaculty.this);

                // String array for alert dialog multi choice items
                String[] colors = new String[]{
                        "Monday   (9:00am - 11:00am)",
                        "Monday   (11:00am - 1:00pm)",
                        "Monday   (2:00pm - 4:00pm)",
                        "Tuesday  (9:00am - 11:00am)",
                        "Tuesday  (11:00am - 1:00pm)",
                        "Tuesday  (2:00pm - 4:00pm)",
                        "Wednesday(9:00am - 11:00am)",
                        "Wednesday(11:00am - 1:00pm)",
                        "Wednesday(2:00pm - 4:00pm)",
                        "Thursday (9:00am - 11:00am)",
                        "Thursday (11:00am - 1:00pm)",
                        "Thursday (2:00pm - 4:00pm)",
                        "Friday   (9:00am - 11:00am)",
                        "Friday   (11:00am - 1:00pm)",
                        "Friday   (2:00pm - 4:00pm)"
                };

                // Boolean array for initial selected items
                final boolean[] checkedColors = new boolean[]{
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false,
                        false

                };

                // Convert the color array to list
                final List<String> slots = Arrays.asList(colors);

                builder.setMultiChoiceItems(colors, checkedColors, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                        // Update the current focused item's checked status
                        checkedColors[which] = isChecked;

                        // Get the current focused item
                        String currentItem = slots.get(which);

                        // Notify the current action
                    }
                });

                // Specify the dialog is not cancelable
                builder.setCancelable(false);

                // Set a title for alert dialog
                builder.setTitle("Your preferred Slots?");

                // Set the positive/yes button click listener
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click positive button
                        tv.setText("Your preferred Slots are : \n");
                        for (int i = 0; i<checkedColors.length; i++){
                            boolean checked = checkedColors[i];
                            if (checked) {
                                tv.setText(tv.getText() + slots.get(i) + "\n");
                            }
                        }
                    }
                });



                // Set the neutral/cancel button click listener
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when click the neutral button
                    }
                });

                AlertDialog dialog = builder.create();
                // Display the alert dialog on interface
                dialog.show();
            }
        });

    }
}
