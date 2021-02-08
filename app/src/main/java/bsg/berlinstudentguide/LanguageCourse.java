package bsg.berlinstudentguide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.text.LineBreaker;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LanguageCourse extends AppCompatActivity {

    Button btnVHS, btnDeutsch, btnKapitel, btnGoethe;
    ImageView ivLanguage;
    TextView tvLanguage;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_course);

        btnVHS = findViewById(R.id.btnVHS);
        btnDeutsch = findViewById(R.id.btnDeutsch);
        btnKapitel = findViewById(R.id.btnKapitel);
        btnGoethe = findViewById(R.id.btnGoethe);
        ivLanguage = findViewById(R.id.ivLanguage);
        tvLanguage = findViewById(R.id.tvLanguage);

        btnVHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.berlin.de/vhs/kurse/deutsch-integration/"));
                startActivity(intent);
            }
        });

        btnDeutsch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.deutschakademie.de/en/"));
                startActivity(intent);
            }
        });

        btnGoethe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.goethe.de/ins/de/en"));
                startActivity(intent);
            }
        });

        btnKapitel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kapitel-zwei.de/en/german-language-course-berlin/intensive-german-course/"));
                startActivity(intent);
            }
        });

        ivLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(LanguageCourse.this);
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

        tvLanguage.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
}