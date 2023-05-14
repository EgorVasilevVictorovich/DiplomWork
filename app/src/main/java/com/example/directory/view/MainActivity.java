package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.directory.R;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;

    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.shoot);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();

        // присваивание id полям
        imageButton = findViewById(R.id.imageButton);



        // обработка нажатия кнопки
        imageButton.setOnClickListener(listener);

    }

    // создание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(intent);

        }
    };
}
