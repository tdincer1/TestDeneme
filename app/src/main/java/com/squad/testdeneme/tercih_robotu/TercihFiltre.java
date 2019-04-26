package com.squad.testdeneme.tercih_robotu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

import com.squad.testdeneme.meslek_testi.SonucEkrani;
import com.squad.testdeneme.R;

import org.florescu.android.rangeseekbar.RangeSeekBar;

public class TercihFiltre extends AppCompatActivity {

    RangeSeekBar rangeSeekBar;
    EditText bolumTuruEt;
    AutoCompleteTextView atv, bolumEt, sehirEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercih_filtre);
        rangeSeekBar = findViewById(R.id.rangeSeekbar);
        atv = findViewById(R.id.uniAramaTv);
        bolumEt = findViewById(R.id.bolumAramaTv);
        sehirEt = findViewById(R.id.sehirAramaTv);
        bolumTuruEt = findViewById(R.id.bolumTuruEt);



        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();


        //deneme amaclı testten gelen meslegi toastta bas
        String deneme = SonucEkrani.secilen;
        //String secilen_meslek = getIntent().getStringExtra("secilen_meslek");

        if (deneme!=null) Toast.makeText(getApplicationContext(),"Secilen meslek: " + SonucEkrani.secilen, Toast.LENGTH_SHORT).show();
        //if (deneme!=null) Toast.makeText(getApplicationContext(),"Secilen_meslek_putExtra: " + secilen_meslek, Toast.LENGTH_SHORT).show();

        rangeSeekBar.setSelectedMaxValue(500);
        rangeSeekBar.setSelectedMinValue(0);

        rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                Number min_value = bar.getSelectedMinValue();
                Number max_value = bar.getSelectedMaxValue();

                int min = (int) min_value;
                int max = (int) max_value;

                Toast.makeText(getApplicationContext(),"Min= " + min + "\n"+ "Max=" + max,Toast.LENGTH_SHORT).show();
            }
        });

        String[] uniListe = TercihDb.getInstance(getApplicationContext()).uniCek();

        atv.setAdapter(new ArrayAdapter<>(TercihFiltre.this, android.R.layout.simple_list_item_1, uniListe));
    }
}
