package bsg.berlinstudentguide;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentApartment extends AppCompatActivity {

    ListView lvList;
    ImageView ivSApartment;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_apartment);

        lvList = findViewById(R.id.lvList);
        ivSApartment = findViewById(R.id.ivSApartment);

        ArrayList<String> data = new ArrayList<>();

        data.add("House of Nation");
        data.add("Studenten Werk");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);

        lvList.setAdapter(arrayAdapter);

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (data.get(position).equals("House of Nation"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.house-of-nations.de/en/"));
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.stw.berlin/wohnen.html"));
                    startActivity(intent);
                }

            }
        });

        ivSApartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder dialog = new AlertDialog.Builder(StudentApartment.this);
                dialog.setMessage("Note: These are not all the options that you have. The provided options are only known by personal experience. " +
                        "There are many more options available.");
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }


}