package com.celiker.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.celiker.kentsimgeleri.databinding.ActivityDetailsBinding;
import com.celiker.kentsimgeleri.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    ArrayList<landmark> landmarks;
private ActivityMainBinding binding;
static landmark secililandmark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());/**inflate diyince
         layout ile kodumuzu bağlayan yer aklımıza gelmeli*/
        View view = binding.getRoot();
        setContentView(view);

        landmarks=new ArrayList<>();

        landmark eyfel =new landmark("Eyfel Kulesi","Fransa", R.drawable.eyfel1);
        landmark aizanoi = new landmark("Aizanoi Antik Kenti","Türkiye", R.drawable.aiza1);
        landmark petronas = new landmark("Petronas İkiz Kuleleri", "Malezya", R.drawable.petronas1);
        landmark koln = new landmark("Köln Katedrali", "Almanya", R.drawable.kolnkatedral1);
        landmark gwall=new landmark("Çin Seddi", "Çin Halk Cumhuriyeti", R.drawable.cinseddi1);

        landmarks.add(eyfel);
        landmarks.add(aizanoi);
        landmarks.add(petronas);
        landmarks.add(koln);
        landmarks.add(gwall);

        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        landmarkRecycle landAdapter = new landmarkRecycle(landmarks);
        binding.recyclerview.setAdapter(landAdapter);




        /**ListView kodları (verimsiz olan)

         Adapter
        mapping:
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarks.stream().map(landmark -> landmark.isim).collect(Collectors.toList())
        );
        binding.listview.setAdapter(arrayAdapter);




        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pozisyon, long l) {
              //her bir hücreye tıklandığında aşağıda toast veren komut :  Toast.makeText(MainActivity.this,landmarks.get(pozisyon).isim,Toast.LENGTH_LONG).show();

                Intent intent= new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landmarks.get(pozisyon));
                startActivity(intent);
            }
        });//bir adet elemana tıklandığında ne olacağıyla ilgili

        */


    }
}