package org.dev4u.hv.guia5_ejemplo;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class EjercicioActivity extends AppCompatActivity {

    ImageView imgView01;
    ImageView imgView2;
    ImageView imgView3;
    Button btnIzq, btnCentro, btnDer;

    Animation anim_comb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIzq = (Button) findViewById(R.id.btnAnimar1);
        btnCentro = (Button) findViewById(R.id.btnAnimar2);
        btnDer = (Button) findViewById(R.id.btnAnimar3);
        imgView01 = (ImageView) findViewById(R.id.imgView01);
        imgView2 = (ImageView) findViewById(R.id.imgView2);
        imgView3 = (ImageView) findViewById(R.id.imgView3);

        //combinado
        //horizontal
        anim_comb = AnimationUtils.loadAnimation(this, R.anim.ejercicio);
        anim_comb.setDuration(1000);
        anim_comb.setFillAfter(true);

        btnIzq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView01.startAnimation(anim_comb);
            }
        });

        btnCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView2.startAnimation(anim_comb);
            }
        });

        btnDer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgView3.startAnimation(anim_comb);
            }
        });
    }
}
