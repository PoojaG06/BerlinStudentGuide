package bsg.berlinstudentguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CityRegistration extends AppCompatActivity {

    Button btnFind;
    ImageView ivTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_registration);

        ivTip = findViewById(R.id.ivTip);
        btnFind = (findViewById(R.id.btnFind));
        btnFind.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://service.berlin.de/dienstleistung/120686/"));
                startActivity(intent);

            }
        });

        ivTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(CityRegistration.this);
                dialog.setMessage("Tip: After reaching the website go to the bottom of the page to find area-wise offices.\n" +
                        "Try searching for an appointment early morning, if someone has canceled some appointment for the day then you can book it.");
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