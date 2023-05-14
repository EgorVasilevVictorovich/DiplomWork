package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.directory.R;
import com.example.directory.model.Notebook;
import com.example.directory.viewmodel.Adapter;
import com.example.directory.viewmodel.DatabaseHelper;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class DirecActivity extends AppCompatActivity {

    // создание полей
    private RecyclerView recyclerView; // поле для списка RecyclerView
    private FloatingActionButton fabAdd; // поле для кнопки добавить новую заметку


    private List<Notebook> notesList; // поле для контейнера списка заметок

    private DatabaseHelper database; // поле работы с БД

    private Adapter adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_direc);
        // присваивание id полям
        recyclerView = findViewById (R.id.recycler_list);
        fabAdd = findViewById (R.id.fabAdd);


        notesList = new ArrayList<> (); // выделение памяти и задание типа контейнера для списка заметок
        database = new DatabaseHelper (this); // выделение памяти и задание текущего контекста работы с БД

        // считывание данных из БД и запись их в коллекцию notesList
        fetchAllNotes ();

        recyclerView.setLayoutManager (new LinearLayoutManager (this)); // задание структуры вывода данных в recyclerView
        adapter = new Adapter (this, DirecActivity.this, notesList); // инициализация адаптера и передача в рего данных из БД
        recyclerView.setAdapter (adapter); // передача в recyclerView адаптер
        // обработка нажатия кнопки создания новой заметки
        fabAdd.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // переключение на новую активность
                // создание намерения переключения активности
                Intent intent = new Intent(DirecActivity.this, AddNotesActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity (intent);

            }
        });


    }

    // метод считывания из БД всех записей
    public void fetchAllNotes() {
        // чтение БД и запись данных в курсор
        Cursor cursor = database.readNotes ();

        if (cursor.getCount () == 0) { // если данные отсутствую, то вывод на экран об этом тоста
            Toast.makeText (this, "Заметок нет", Toast.LENGTH_SHORT).show ();
        } else { // иначе помещение их в контейнер данных notesList
            while (cursor.moveToNext ()) {
                // помещение в контейнер notesList из курсора данных
                notesList.add (new Notebook (cursor.getString (0), cursor.getString (1), cursor.getString (2)));
            }
        }
    }
}

