package bsg.berlinstudentguide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HealthInsurance extends AppCompatActivity {

    Button btnInsurance;
    TextView tvInsurance1, tvInsurance2, tvInsurance3;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_insurance);

        btnInsurance = findViewById(R.id.btnInsurance);
        tvInsurance1 = findViewById(R.id.tvInsurance1);
        tvInsurance2 = findViewById(R.id.tvInsurance2);
        tvInsurance3 = findViewById(R.id.tvInsurance3);

        btnInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthInsurance.this, InsuranceOptions.class);
                startActivity(intent);
            }
        });

        tvInsurance1.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        tvInsurance2.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        tvInsurance3.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
}