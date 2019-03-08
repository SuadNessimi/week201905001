package org.kasapbasi.week201905001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv= (ListView) findViewById(R.id.Listview);

        final ArrayList<String> liste = new ArrayList<>();

        liste.add("TrabzonSpor");
        liste.add("RizeSpor");
        liste.add("Fenerbahçe");
        liste.add("Galatasaray");
        liste.add("Beşiktaş");

        final ArrayList<Kisiler> liste2= new ArrayList<>();
        liste2.add( new Kisiler("Ahmet","Boncuk"));
        liste2.add( new Kisiler("Mustafa","Gölet"));
        liste2.add( new Kisiler("Sönmez","Çimen"));
        liste2.add( new Kisiler("Tevfik","Aksu"));



        ArrayAdapter<String> adap= new ArrayAdapter<String>(getApplicationContext(),
                 android.R.layout.simple_list_item_1,liste);

        ArrayAdapter<Kisiler> adap2= new ArrayAdapter<Kisiler>(
                getApplicationContext(),android.R.layout.simple_list_item_1, liste2);


        //lv.setAdapter(adap);

        lv.setAdapter(adap2);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("Tıklanan:",((Kisiler)liste2.get(i)).toString());
            }
        });
    }
}
