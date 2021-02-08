package bsg.berlinstudentguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OptionAdapter.ItemClicked {

    ArrayList<Options> option;

    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        option = new ArrayList<Options>();
        option.add(new Options("Find an Apartment"));
        option.add(new Options("City Registration (Wohnung Anmeldung)"));
        option.add(new Options("Block Account"));
        option.add(new Options("Health Insurance"));
        option.add(new Options("Visa Extension"));
        option.add(new Options("German Language Courses"));
        option.add(new Options("Travel Pass"));

        myAdapter = new OptionAdapter(this, option);

        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void ItemClicked(int index) {

        if (option.get(index).getType().equals("Find an Apartment"))
        {
            Intent intent = new Intent(MainActivity.this, Apartment.class);
            startActivity(intent);
        }
        else if (option.get(index).getType().equals("City Registration (Wohnung Anmeldung)"))
        {
            Intent intent = new Intent(MainActivity.this, CityRegistration.class);
            startActivity(intent);
        }
        else if (option.get(index).getType().equals("Block Account"))
        {
            Intent intent = new Intent(MainActivity.this, BlockAccount.class);
            startActivity(intent);
        }
        else if (option.get(index).getType().equals("Health Insurance"))
        {
            Intent intent = new Intent(MainActivity.this, HealthInsurance.class);
            startActivity(intent);
        }
        else if (option.get(index).getType().equals("Visa Extension"))
        {
            Intent intent = new Intent(MainActivity.this, VisaExtension.class);
            startActivity(intent);
        }
        else if (option.get(index).getType().equals("German Language Courses"))
        {
            Intent intent = new Intent(MainActivity.this, LanguageCourse.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(MainActivity.this, TravelPass.class);
            startActivity(intent);
        }
    }
}