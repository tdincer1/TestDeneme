package com.squad.testdeneme.meslek_testi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.squad.testdeneme.R;

public class MtAnaSayfa extends AppCompatActivity { //Meslek Testimizin karşılama sayfası
    Button btn1,btn2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt_ana_sayfa);

        btn1=findViewById(R.id.mt_anasayfa_btn1);
        btn2=findViewById(R.id.mt_anasayfa_btn2);
        btn1.setOnClickListener(new View.OnClickListener() {    //Test ekranına geçiş
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MtAnaSayfa.this, MtTestActivity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {    //Test sonuç ekranına geçiş
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MtAnaSayfa.this,MtSonucKaydedilen.class);
                startActivity(i);
            }
        });
    }
}
