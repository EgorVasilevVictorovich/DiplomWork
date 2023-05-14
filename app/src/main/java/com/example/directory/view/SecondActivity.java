package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.directory.R;

public class SecondActivity extends AppCompatActivity {
    // создание полей
    private ImageButton imageButtonMathem;
    private ImageButton imageButtonPhys;
    private ImageButton imageButtonChemis;
    private ImageButton imageButtonDirec;
    private ImageButton imageButtonTaim;
    private ImageButton imageButtonTable;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);

        // присваивание id полям
        imageButtonMathem = findViewById(R.id.imageButtonMathem);
        imageButtonPhys = findViewById(R.id.imageButtonPhys);
        imageButtonChemis = findViewById(R.id.imageButtonChemis);
        imageButtonDirec = findViewById(R.id.imageButtonDirec);
        imageButtonTaim = findViewById(R.id. imageButtonTaim);
        imageButtonTable = findViewById(R.id. imageButtonTable);

        // обработка нажатия кнопки
        imageButtonMathem.setOnClickListener(listener);
        imageButtonPhys.setOnClickListener(listener);
        imageButtonChemis.setOnClickListener(listener);
        imageButtonDirec.setOnClickListener(listener);
        imageButtonTaim.setOnClickListener(listener);
        imageButtonTable.setOnClickListener(listener);
    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener () {
        @Override
        public void onClick(View view) {

            // переключение на новую активность
            switch (view.getId ()) {

                case R.id.imageButtonMathem:

                    Intent intentMathem = new Intent (getApplicationContext (), MathemActivity.class);
                    intentMathem.addFlags (Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    startActivity (intentMathem);
                    break;

                case R.id.imageButtonPhys:

                    Intent intentPhys = new Intent (getApplicationContext (), PhysActivity.class);
                    intentPhys.addFlags (Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity (intentPhys);
                    break;

                case R.id.imageButtonChemis:

                    Intent intentChemis = new Intent (getApplicationContext (), ChemisActivity.class);
                    intentChemis.addFlags (Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity (intentChemis);
                    break;

                case R.id.imageButtonDirec:

                    Intent intentDirec = new Intent (getApplicationContext (), DirecActivity.class);
                    intentDirec.addFlags (Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity (intentDirec);
                    break;

                case R.id.imageButtonTaim:

                    Intent intentTaim = new Intent (getApplicationContext (), TaimActivity.class);
                    intentTaim.addFlags (Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity (intentTaim);
                    break;

                case R.id.imageButtonTable:

                    Intent intentTable = new Intent (getApplicationContext (), TableActivity.class);
                    intentTable.addFlags (Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity (intentTable);
                    break;

            }
        }
    };
}

