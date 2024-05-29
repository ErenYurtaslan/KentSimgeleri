package com.celiker.kentsimgeleri;

import static com.celiker.kentsimgeleri.MainActivity.secililandmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.celiker.kentsimgeleri.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
  //  TextView isimtext; bu artık view binding dolayısıyla yok.

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());/**inflate diyince
         layout ile kodumuzu bağlayan yer aklımıza gelmeli*/
        View view = binding.getRoot();
        setContentView(view);

        Intent intent= getIntent();




        /**casting, bir şeyi bir şeye dönüştürme;
         * eşittirden sonraki parantezli landmarkı yazarak hatayı giderme işlemi*/
        landmark secilmislandmark= (landmark) intent.getSerializableExtra("landmark");
        binding.isimtext.setText(secilmislandmark.isim);
        binding.ulketext.setText(secilmislandmark.ulke);
        binding.foto.setImageResource(secilmislandmark.image);

      // isimtext=findViewById(R.id.isimtext); bu artık view binding dolayısıyla yok.

        /**view binding*/
    }
}