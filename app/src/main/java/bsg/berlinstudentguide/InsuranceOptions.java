package bsg.berlinstudentguide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class InsuranceOptions extends AppCompatActivity {
    ImageView ivTipIn, ivNoteIn;
    ListView lvListIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insurance_options);

        ivTipIn = findViewById(R.id.ivTipIn);
        ivNoteIn = findViewById(R.id.ivNoteIn);
        lvListIn = findViewById(R.id.lvListIn);

        ArrayList<String> insurance = new ArrayList<>();

        insurance.add("TK");
        insurance.add("Barmer");
        insurance.add("AOK");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,insurance);

        lvListIn.setAdapter(arrayAdapter);

        lvListIn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (insurance.get(position).equals("TK"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tk.de/en"));
                    startActivity(intent);
                }
                else if (insurance.get(position).equals("Barmer"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.barmer.de/en"));
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aok.de/kp/uni/information-for-international-students/information-on-health-insurance/"));
                    startActivity(intent);
                }
            }
        });


        ivTipIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(InsuranceOptions.this);
                dialog.setMessage("Tip: Monthly payments and services of all these insurance vary slightly. Go through the details and select the one that suits you.");
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

        ivNoteIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(InsuranceOptions.this);
                dialog.setMessage("Note: These are not all the options that you have. The provided options are only known by personal experience. There are many more options available.");
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
    }
}