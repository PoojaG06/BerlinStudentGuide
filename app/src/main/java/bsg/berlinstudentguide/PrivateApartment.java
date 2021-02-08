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

public class PrivateApartment extends AppCompatActivity {

    ListView lvList;
    ImageView ivApartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_apartment);

        lvList = findViewById(R.id.lvList);
        ivApartment = findViewById(R.id.ivApartment);

        ArrayList<String> data = new ArrayList<>();

        data.add("Wunderflats");
        data.add("Uniplaces");
        data.add("Spot a Home");
        data.add("Insider Apartments");
        data.add("Orbis Apartments");
        data.add("Eichen Global");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,data);

        lvList.setAdapter(arrayAdapter);

        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (data.get(position).equals("Wunderflats"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wunderflats.com/en"));
                    startActivity(intent);
                }
                else if (data.get(position).equals("Uniplaces"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uniplaces.com"));
                    startActivity(intent);
                }
                else if (data.get(position).equals("Spot a Home"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.spotahome.com"));
                    startActivity(intent);
                }
                else if (data.get(position).equals("Insider Apartments"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://insiderapartments.com"));
                    startActivity(intent);
                }
                else if (data.get(position).equals("Eichen Global"))
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eichenglobal.com/en/index_0__1_sp1_1.html"));
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.orbis-apartments.de/en/"));
                    startActivity(intent);
                }
            }
        });

        ivApartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder dialog = new AlertDialog.Builder(PrivateApartment.this);
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