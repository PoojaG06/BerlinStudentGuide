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

public class VisaExtension extends AppCompatActivity {

    Button btnSVisa, btnOVisa;
    TextView tvExtension, tvExtension3;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visa_extension);

        tvExtension = findViewById(R.id.tvExtension);
        tvExtension3 = findViewById(R.id.tvExtension3);
        btnOVisa = findViewById(R.id.btnOVisa);
        btnSVisa = findViewById(R.id.btnSVisa);

        btnSVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://service.berlin.de/dienstleistung/305244/en/"));
                startActivity(intent);
            }
        });

        btnOVisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://service.berlin.de/dienstleistungen/migration-integration/"));
                startActivity(intent);
            }
        });

        tvExtension.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        tvExtension3.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
}