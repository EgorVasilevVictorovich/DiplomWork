package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.directory.R;
import com.example.directory.viewmodel.DatabaseHelper;

public class UpdateActivity extends AppCompatActivity {

    private EditText title, description;
    private ImageButton updateNote, deleteNote;
    private String id;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_update);
        // присваивание id полям
        title = findViewById(R.id.title);
        description = findViewById(R.id.description);
        updateNote = findViewById(R.id.update_note);
        deleteNote = findViewById(R.id.delete_note);

        // считывание данных из переданного намерения Intent
        Intent intent = getIntent();
        // запись этих данных на экран активности
        title.setText(intent.getStringExtra("title"));
        description.setText(intent.getStringExtra("description"));
        id = intent.getStringExtra("id");

        // обработка нажатия кнопки
        updateNote.setOnClickListener(listener);
        deleteNote.setOnClickListener(listener);
    }

    // задание слушателя
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // если исправленный текст не пустой, то обновление записи в БД
            if (!TextUtils.isEmpty(title.getText().toString()) && !TextUtils.isEmpty(description.getText().toString())) {
                DatabaseHelper database = new DatabaseHelper (UpdateActivity.this); // создание объекта БД в текущей активности

                // обработка кнопки
                switch (view.getId()) {
                    case R.id.update_note:
                        // обновление заметки
                        database.updateNotes(title.getText().toString(), description.getText().toString(), id); // обновление записи в БД по id
                        break;
                    case R.id.delete_note:
                        // удаление заметки
                        database.deleteSingleItem(id); // удаление записи БД по id
                        break;
                }

                startActivity(new Intent(UpdateActivity.this, DirecActivity.class)); // переключение обратно в активность демонстрации всех записей
            } else { // иначе просто тост об отсутствии изменений
                Toast.makeText(UpdateActivity.this, "Изменений не внесено", Toast.LENGTH_SHORT).show();
            }
        }
    };
}