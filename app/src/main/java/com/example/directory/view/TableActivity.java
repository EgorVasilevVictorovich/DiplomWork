package com.example.directory.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.example.directory.R;

public class TableActivity extends AppCompatActivity {
    private ConstraintLayout mBackground;
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private SubsamplingScaleImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_table);
        imageView = (SubsamplingScaleImageView)findViewById(R.id.imageView);
        mBackground = (ConstraintLayout) findViewById (R.id.background);
        b1 = findViewById (R.id.b1);
        b2 = findViewById (R.id.b2);
        b3 = findViewById (R.id.b3);
        b4 = findViewById (R.id.b4);
        b5 = findViewById (R.id.b5);
        b6 = findViewById (R.id.b6);
        b1.setOnClickListener (listener);
        b2.setOnClickListener (listener);
        b3.setOnClickListener (listener);
        b4.setOnClickListener (listener);
        b5.setOnClickListener (listener);
        b6.setOnClickListener (listener);

    }

    private View.OnClickListener listener = new View.OnClickListener () {
        @Override
        public void onClick(View v) {

            switch (v.getId ()) {
                case R.id.b1:
                    mBackground.setBackgroundResource (R.drawable.fonra);
                    imageView.setImage(ImageSource.resource(R.drawable.mendel));
                    break;
                case R.id.b2:
                    mBackground.setBackgroundResource (R.drawable.fonra);
                    imageView.setImage(ImageSource.resource(R.drawable.otri));
                    break;
                case R.id.b3:
                    mBackground.setBackgroundResource (R.drawable.fonra);
                    imageView.setImage(ImageSource.resource(R.drawable.kbad));
                    break;
                case R.id.b4:
                    mBackground.setBackgroundResource (R.drawable.fonra);
                    imageView.setImage(ImageSource.resource(R.drawable.klub));
                    break;
                case R.id.b5:
                    mBackground.setBackgroundResource (R.drawable.fonra);
                    imageView.setImage(ImageSource.resource(R.drawable.plotm));
                    break;
                case R.id.b6:
                    mBackground.setBackgroundResource (R.drawable.fon);
                    imageView.setImage(ImageSource.resource(R.drawable.tablica_tem));
                    break;

            }
        }
    };
}