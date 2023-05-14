package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.directory.R;
import com.example.directory.model.Animal;
import com.example.directory.viewmodel.AnimalAdapter;

import java.util.ArrayList;
import java.util.List;

public class PhysActivity extends AppCompatActivity {

    List<Animal> animals = new ArrayList<Animal> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_phys);
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal

        animals.add (new Animal( "Механика",R.drawable.fz1));
        animals.add (new Animal( "Механика",R.drawable.fz2_1));
        animals.add (new Animal( "Основные формулы",R.drawable.fz3));
        animals.add (new Animal( "Динамика",R.drawable.fz2));
        animals.add (new Animal( "МКТ и ТД",R.drawable.fz4));
        animals.add (new Animal( "Термодинамика",R.drawable.fz5));
        animals.add (new Animal( "Термодинамика",R.drawable.fz5_1));
        animals.add (new Animal( "Электродинамика",R.drawable.fz6));
        animals.add (new Animal( "Основные формулы",R.drawable.fz7));
        animals.add (new Animal( "Основные формулы",R.drawable.fz7_1));
        animals.add (new Animal( "Основные формулы",R.drawable.fz8_1));
        animals.add (new Animal( "Основные формулы",R.drawable.fz8_2));
        animals.add (new Animal( "Основные формулы",R.drawable.fz8_3));
        animals.add (new Animal( "Переменный ток",R.drawable.fiz4_1));
        animals.add (new Animal( "Колебания и волны",R.drawable.fz8));
        animals.add (new Animal( "Основные формулы",R.drawable.fz10));
        animals.add (new Animal( "Основные формулы",R.drawable.fz11));
        animals.add (new Animal( "Основные формулы",R.drawable.fz12));
        animals.add (new Animal( "Основные формулы",R.drawable.fz13));
        animals.add (new Animal( "Оптика",R.drawable.fz14));
        animals.add (new Animal( "Оптика",R.drawable.fz15));
        animals.add (new Animal( "Оптика",R.drawable.fz16));
        animals.add (new Animal( "Оптика",R.drawable.fz16_1));
        animals.add (new Animal( "Атомная физика",R.drawable.fz17));
        animals.add (new Animal( "Атомная физика",R.drawable.fz18));
        animals.add (new Animal( "Атомная физика",R.drawable.fz19));
        animals.add (new Animal( "Атомная физика",R.drawable.fz20));
        animals.add (new Animal( "Атомная физика",R.drawable.fz21));
        animals.add (new Animal( "Атомная физика",R.drawable.fz22));
        animals.add (new Animal( "Атомная физика",R.drawable.fz23));
        animals.add (new Animal( "Атомная физика",R.drawable.fz33));
        animals.add (new Animal( "Атомная физика",R.drawable.fz34_1));
        animals.add (new Animal( "Атомная физика",R.drawable.fz34));
        animals.add (new Animal( "Атомная физика",R.drawable.fz44));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz24));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz25));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz26));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz27));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz28));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz29));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz30));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz31));
        animals.add (new Animal( "Квантовая физика",R.drawable.fz32));
        animals.add (new Animal( "Астрономия",R.drawable.fz45));
        animals.add (new Animal( "Астрономия",R.drawable.fz35));
        animals.add (new Animal( "Астрономия",R.drawable.fz36));
        animals.add (new Animal( "Астрономия",R.drawable.fz37));
        animals.add (new Animal( "Астрономия",R.drawable.fz38));
        animals.add (new Animal( "Астрономия",R.drawable.fz39));
        animals.add (new Animal( "Астрономия",R.drawable.fz40));
        animals.add (new Animal( "Астрономия",R.drawable.fz41));
        animals.add (new Animal( "Астрономия",R.drawable.fz42));
        animals.add (new Animal( "Астрономия",R.drawable.fz43));
        animals.add (new Animal( "Астрономия",R.drawable.fz46));
    }

}