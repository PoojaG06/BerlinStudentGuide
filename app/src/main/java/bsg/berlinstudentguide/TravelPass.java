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

public class TravelPass extends AppCompatActivity {

    Button btnBVGOnline;
    ImageView ivTips;
    TextView tvPass;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_pass);

        btnBVGOnline = findViewById(R.id.btnBVGOnline);
        ivTips = findViewById(R.id.ivTips);
        tvPass = findViewById(R.id.tvPass);

        btnBVGOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bvg.de/de/abo-online/azubi-ticket"));
                startActivity(intent);
            }
        });

        ivTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(TravelPass.this);
                dialog.setMessage("Tip: For student pass, you need to select Azubivertrag / Schülerausweis II on the given website.\n" +
                        "If your German Language is not that good then use Translator on web pages.");
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        tvPass.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
}