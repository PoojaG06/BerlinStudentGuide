package bsg.berlinstudentguide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.text.LineBreaker;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Apartment extends AppCompatActivity {

    Button btnStudent, btnPrivate, btnHostel;
    TextView tvApartment, tvApartment2, tvApartment4;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment);


        tvApartment = findViewById(R.id.tvApartment);
        tvApartment2 = findViewById(R.id.tvApartment2);
        tvApartment4 = findViewById(R.id.tvApartment4);
        btnStudent = findViewById(R.id.btnStudent);
        btnPrivate = findViewById(R.id.btnPrivate);
        btnHostel = findViewById(R.id.btnHostel);

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Apartment.this, StudentApartment.class);
                startActivity(intent);
            }
        });

        btnPrivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Apartment.this, PrivateApartment.class);
                startActivity(intent);
            }
        });

        btnHostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hostelworld.com"));
                startActivity(intent);
            }
        });

        tvApartment.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        tvApartment2.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        tvApartment4.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
}