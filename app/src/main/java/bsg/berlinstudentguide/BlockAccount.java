package bsg.berlinstudentguide;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BlockAccount extends AppCompatActivity {

    ImageView ivTIP;
    TextView tvInfo, tvInfo2;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block_account);

        ivTIP = findViewById(R.id.ivTIP);
        tvInfo = findViewById(R.id.tvPass);
        tvInfo2 = findViewById(R.id.tvInfo2);

        ivTIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder dialog = new AlertDialog.Builder(BlockAccount.this);
                dialog.setMessage("Tip: Bring enough money in Cash or International Debit Card to manage your expenses till the Block Account is done");
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.dismiss();
                    }
                });
                dialog.show();

            }
        });

        tvInfo.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        tvInfo2.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
    }
}